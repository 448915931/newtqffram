package com.tqfframe.nettychat.config;

import com.tqfframe.nettychat.web.interceptor.UserAuthInteceptor;
import com.tqfframe.nettychat.web.websocket.WebSocketChildChannelHandler;
import com.tqfframe.nettychat.web.websocket.WebSocketServer;
import io.netty.bootstrap.ServerBootstrap;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.nio.NioEventLoopGroup;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import javax.annotation.Resource;

@Configuration
public class ApplicationConfig implements WebMvcConfigurer {

    @Resource(name = "webSocketChildChannelHandler")
    private WebSocketChildChannelHandler webSocketChildChannelHandler;
    //netty端口
    @Value(value = "${netty.chat.port}")
    private int port;

    //注入WebSocketServer
    @Bean
    public WebSocketServer getWebSocketServer() {
        WebSocketServer webSocketServer = new WebSocketServer();
        webSocketServer.setPort(port);
        webSocketServer.setChildChannelHandler(webSocketChildChannelHandler);
        return webSocketServer;
    }

    @Bean("bossGroup")
    public EventLoopGroup getBossGroup() {
        return new NioEventLoopGroup();
    }

    @Bean("workerGroup")
    public EventLoopGroup getWorkerGroup() {
        return new NioEventLoopGroup();
    }

    @Bean
    public ServerBootstrap getServerBootstrap(){
        return new ServerBootstrap();
    }

    // 配置拦截器
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new UserAuthInteceptor()).addPathPatterns("/chatroom/**");
    }

}
