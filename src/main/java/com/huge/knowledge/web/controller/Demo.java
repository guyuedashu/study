package com.huge.knowledge.web.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author huyunlong
 * @version 1.0.0               @RestController是@Controller和@@ResponseBody的结合返回
 *                                                  JSON数据
 * @history<br/> <p/>
 * @since 1.0.0
 */
@RestController
public class Demo {

    @RequestMapping(value = "/hello")
    public String helloWorld()
    {

        return "你好呀";
    }
}
