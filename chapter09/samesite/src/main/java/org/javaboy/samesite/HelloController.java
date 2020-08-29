package org.javaboy.samesite;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

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
public class HelloController {
    @PostMapping("/withdraw")
    public void withdraw() {
        System.out.println("执行了一次转账操作");
    }

    @GetMapping("/hello")
    public void hello(HttpSession session) {
        System.out.println("session = " + session);
    }
}
