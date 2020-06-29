package com.tqfframe.nettychat.web.websocket;

import io.netty.bootstrap.ServerBootstrap;
import io.netty.channel.*;
import io.netty.channel.socket.nio.NioServerSocketChannel;
import io.netty.util.concurrent.Future;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

/**
 * 描述: Netty WebSocket服务器
 *      使用独立的线程启动
 * @author tangqifeng
 * @version 1.0
 */
public class WebSocketServer implements Runnable{

    private final Logger logger = LoggerFactory.getLogger(WebSocketServer.class);

	// 这2个group都是死循环，阻塞式
	@Autowired
	@Qualifier("bossGroup")
	private EventLoopGroup bossGroup;
	@Autowired
	@Qualifier("workerGroup")
	private EventLoopGroup workerGroup;
	// 创建一个ServerBootstrap 实例用来配置启动Netty服务器
	@Autowired
	private ServerBootstrap serverBootstrap;
	//netty服务器端口
	private int port;
	//要被调用的channelHandler,也就是异步请求后的执行方法需要通过这个去定义（主要的接口）
	private ChannelHandler childChannelHandler;
	//用于绑定服务的端口，启动netty服务。
	private ChannelFuture serverChannelFuture;
	
	public WebSocketServer() {
	    
	}

	@Override
	public void run() {
        build();
	}
	
	/**
	 * 描述：启动Netty Websocket服务器
	 */
	public void build() {
		try {
		    long begin = System.currentTimeMillis();
			serverBootstrap.group(bossGroup, workerGroup) //boss辅助客户端的tcp连接请求  worker负责与客户端之前的读写操作
						   .channel(NioServerSocketChannel.class) //重要！！！配置客户端的channel类型，这里使用socket类型，表示前端使用soket进行调用netty服务
						   .option(ChannelOption.SO_BACKLOG, 1024) //配置TCP参数，握手字符串长度设置
						   .option(ChannelOption.TCP_NODELAY, true) //TCP_NODELAY算法，尽可能发送大块数据，减少充斥的小块数据
						   .childOption(ChannelOption.SO_KEEPALIVE, true)//开启心跳包活机制，就是客户端、服务端建立连接处于ESTABLISHED状态，超过2小时没有交流，机制会被启动
						   .childOption(ChannelOption.RCVBUF_ALLOCATOR, new FixedRecvByteBufAllocator(592048))//配置固定长度接收缓存区分配器
						   .childHandler(childChannelHandler); //绑定I/O事件的处理类,WebSocketChildChannelHandler中定义
			long end = System.currentTimeMillis();
	        logger.info("Netty Websocket服务器启动完成，耗时 " + (end - begin) + " ms，已绑定端口 " + port + " 阻塞式等候客户端连接");
			
	        serverChannelFuture = serverBootstrap.bind(port).sync();
		} catch (Exception e) {
		    logger.info(e.getMessage());
			bossGroup.shutdownGracefully();
            workerGroup.shutdownGracefully();
            e.printStackTrace();
		}

	}
	
	/**
	 * 描述：关闭Netty Websocket服务器，主要是释放连接
	 *     连接包括：服务器连接serverChannel，
	 *     客户端TCP处理连接bossGroup，
	 *     客户端I/O操作连接workerGroup
	 *     
	 *     若只使用
	 *         bossGroupFuture = bossGroup.shutdownGracefully();
	 *         workerGroupFuture = workerGroup.shutdownGracefully();
	 *     会造成内存泄漏。
	 */
	public void close(){
	    serverChannelFuture.channel().close();
		Future<?> bossGroupFuture = bossGroup.shutdownGracefully();
        Future<?> workerGroupFuture = workerGroup.shutdownGracefully();
        
        try {
            bossGroupFuture.await();
            workerGroupFuture.await();
        } catch (InterruptedException ignore) {
            ignore.printStackTrace();
        }
	}
	
	public ChannelHandler getChildChannelHandler() {
        return childChannelHandler;
    }

    public void setChildChannelHandler(ChannelHandler childChannelHandler) {
        this.childChannelHandler = childChannelHandler;
    }

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }

}
