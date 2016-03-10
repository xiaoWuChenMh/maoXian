package com.maoxian.manager.controller.permissions;

import com.maoxian.manager.service.permissions.TestService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

/**
 * Created by hui on 2016/3/7.
 */
@Controller
@RequestMapping("/test")
public class TestController {

    @Resource(name="testServiceImpl")
    public TestService testService;
    @RequestMapping("/one")
    public String testOne(){
        System.out.println("第一个");
        testService.test();
        return "one.ftl";
    }
}
