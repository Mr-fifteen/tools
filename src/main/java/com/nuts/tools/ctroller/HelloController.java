package com.nuts.tools.ctroller;

import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author liuwenxv
 * @date 2021/7/26 11:28
 * @comment
 */

@Api(tags = "默认主入口")
@Controller
public class HelloController {

    @Value("${name}")
    String name;

    @RequestMapping("/")
    @ResponseBody
    public String getHello() {
        return "hello"+name;
    }
}
