package org.javaboy.formlogin.controller;

import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.security.Principal;

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
public class LoginController {
    @RequestMapping("/index")
    public String index() {
        return "login success";
    }
    @RequestMapping("/hello")
    public String hello() {
        return "hello spring security";
    }
    @RequestMapping("/authentication")
    public void authentication(Authentication authentication) {
        System.out.println("authentication = " + authentication);
    }
    @RequestMapping("/principal")
    public void principal(Principal principal, HttpServletRequest req) {
        System.out.println("req.getClass() = " + req.getClass());
        System.out.println("principal = " + principal);
    }
    @RequestMapping("/info")
    public void info(HttpServletRequest req) {
        String remoteUser = req.getRemoteUser();
        Authentication auth = ((Authentication) req.getUserPrincipal());
        boolean admin = req.isUserInRole("admin");
        System.out.println("remoteUser = " + remoteUser);
        System.out.println("auth.getName() = " + auth.getName());
        System.out.println("admin = " + admin);
    }
}
