package org.javaboy.cors01;

import org.springframework.web.bind.annotation.*;

/**
 * @author 江南一点雨
 * @微信公众号 江南一点雨
 * @网站 http://www.itboyhub.com
 * @国际站 http://www.javaboy.org
 * @微信 a_java_boy
 * @GitHub https://github.com/lenve
 * @Gitee https://gitee.com/lenve
 */
@RestController
    @CrossOrigin(origins = "http://localhost:8081", allowedHeaders = "*", methods = {RequestMethod.POST}, maxAge = 60 * 30, exposedHeaders = {"Access-Control-Request-Headers","Access-Control-Request-Method"})
public class HelloController {
    @PostMapping("/post")
    public String post() {
        return "hello post";
    }

    @CrossOrigin(origins = "http://localhost:8081", allowedHeaders = "*", methods = {RequestMethod.PUT,RequestMethod.OPTIONS}, maxAge = 60 * 30, exposedHeaders = {"Access-Control-Max-Age"})
    @PutMapping("/put")
    public String put() {
        return "hello put";
    }

    @GetMapping("/get")
    public String get() {
        return "hello get";
    }
}
