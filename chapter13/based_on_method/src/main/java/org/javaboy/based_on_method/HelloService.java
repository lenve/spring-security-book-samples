package org.javaboy.based_on_method;

import org.springframework.security.access.annotation.Secured;
import org.springframework.security.access.prepost.PostAuthorize;
import org.springframework.security.access.prepost.PostFilter;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.access.prepost.PreFilter;
import org.springframework.stereotype.Service;

import javax.annotation.security.DenyAll;
import javax.annotation.security.PermitAll;
import javax.annotation.security.RolesAllowed;
import java.util.ArrayList;
import java.util.List;

/**
 * @author 江南一点雨
 * @微信公众号 江南一点雨
 * @网站 http://www.itboyhub.com
 * @国际站 http://www.javaboy.org
 * @微信 a_java_boy
 * @GitHub https://github.com/lenve
 * @Gitee https://gitee.com/lenve
 */
@Service
public class HelloService {
    @PreAuthorize("hasRole('ADMIN') and authentication.name=='javaboy'")
    public String hello() {
        return "hello";
    }

    @PreAuthorize("authentication.name==#name")
    public String hello(String name) {
        return "hello:" + name;
    }

    @PreFilter(value = "filterObject.id%2!=0",filterTarget = "users")
    public void addUsers(List<User> users, Integer other) {
        System.out.println("users = " + users);
    }

    @PostAuthorize("returnObject.id==1")
    public User getUserById(Integer id) {
        return new User(id, "javaboy");
    }

    @PostFilter("filterObject.id%2==0")
    public List<User> getAll() {
        List<User> users = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            users.add(new User(i, "javaboy:" + i));
        }
        return users;
    }

    @Secured({"ROLE_ADMIN","ROLE_USER"})
    public User getUserByUsername(String username) {
        return new User(99, username);
    }


    @Secured({"READ_USER"})
    public User getUserByUsername2(String username) {
        return new User(99, username);
    }

    @PermitAll
    public String permitAll() {
        return "PermitAll";
    }

    @DenyAll
    public String denyAll() {
        return "DenyAll";
    }

    @RolesAllowed({"ADMIN","USER"})
    public String rolesAllowed() {
        return "RolesAllowed";
    }
}
