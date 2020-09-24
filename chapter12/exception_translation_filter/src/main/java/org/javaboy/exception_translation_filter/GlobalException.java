package org.javaboy.exception_translation_filter;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import javax.servlet.ServletException;
import javax.sql.rowset.serial.SerialException;

/**
 * @author 江南一点雨
 * @微信公众号 江南一点雨
 * @网站 http://www.itboyhub.com
 * @国际站 http://www.javaboy.org
 * @微信 a_java_boy
 * @GitHub https://github.com/lenve
 * @Gitee https://gitee.com/lenve
 */
@RestControllerAdvice
public class GlobalException {
    @ExceptionHandler(ServletException.class)
    public void handle1(ServletException e) {
        System.out.println("e.getMessage() = " + e.getMessage());
    }
}
