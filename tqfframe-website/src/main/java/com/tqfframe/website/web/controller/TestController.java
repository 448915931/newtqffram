package com.tqfframe.website.web.controller;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.tqfframe.website.client.UserClient;
import com.tqfframe.website.web.common.Result;
import com.tqfframe.website.web.vo.TestDTO;
import com.tqfframe.website.web.entry.TestEntity;
import com.tqfframe.website.web.service.TestService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

/**
 * Created by Tang-QiFeng on 2020/6/24
 */
@RestController
public class TestController {

    Logger logger = LoggerFactory.getLogger(TestController.class);

    @Autowired
    private UserClient userClient;
    @Autowired
    private TestService testService;

    @Value(value = "${tang}")
    private String tang;

    /**
     *  本地
     *  http://localhost:8080/api/website/testhystrix/11111
     *  http://localhost:9001/testhystrix/11111
     *
     *  docker
     *  http://192.168.47.135:8080/api/website/testhystrix/11111
     *  http://192.168.47.135:9001/testhystrix/11111
     *
     * @param name
     * @return
     */
    @GetMapping(value = "/testhystrix/{name}")
    public String testhystrix(@PathVariable(name = "name") String name){
        logger.info(name);
        logger.debug(name);
        logger.error(name);
        logger.info(tang);
        //调用user服务接口
        return  userClient.testhystrix(name);
    }

    @RequestMapping(value = "/getOne/{id}", method = RequestMethod.GET)
    public Result<TestEntity> getOne(@PathVariable String id) {
        Result<TestEntity> result = new Result<TestEntity>();
        TestEntity aa = testService.getById(id);
        if (aa == null) {
            result.error500("未找到对应实体");
        } else {
            result.setResult(aa);
            result.setSuccess(true);
        }
        return result;
    }

    /**
     *      http://localhost:8080/api/website/list/0/10
     *
     * @param pageNum
     * @param pageSize
     * @return
     */
    @RequestMapping(value = "/list/{pageNum}/{pageSize}", method = RequestMethod.GET)
    public Result<IPage<TestDTO>> queryPageList(@PathVariable Integer pageNum, @PathVariable Integer pageSize) {
        Result<IPage<TestDTO>> result = new Result<IPage<TestDTO>>();
        // IPage的convert()方法做包装
        IPage<TestDTO> pageList = testService.getPageByName(new Page(pageNum, pageSize), "tang123");
        result.setSuccess(true);
        result.setResult(pageList);
        return result;
    }

}
