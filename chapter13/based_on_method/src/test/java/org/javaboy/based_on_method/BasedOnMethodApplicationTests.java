package org.javaboy.based_on_method;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.test.context.support.WithMockUser;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
class BasedOnMethodApplicationTests {

    @Autowired
    HelloService helloService;
    @Test
    @WithMockUser(roles = "ADMIN")
    void postFilterTest01() {
        List<User> all = helloService.getAll();
        assertNotNull(all);
        assertEquals(5, all.size());
        assertEquals(2,all.get(1).getId());
    }
    @Test
    @WithMockUser(roles = "ADMIN",username = "javaboy")
    void preauthorizeTest01() {
        String hello = helloService.hello();
        assertNotNull(hello);
        assertEquals("hello", hello);
    }
    @Test
    @WithMockUser(username = "javaboy")
    void preauthorizeTest02() {
        String hello = helloService.hello("javaboy");
        assertNotNull(hello);
        assertEquals("hello:javaboy", hello);
    }

    @Test
    @WithMockUser(username = "javaboy")
    void preFilterTest01() {
        List<User> users = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            users.add(new User(i, "javaboy:" + i));
        }
        helloService.addUsers(users, 99);
    }


    @Test
    @WithMockUser(username = "javaboy")
    void postAuthorizeTest01() {
        User user = helloService.getUserById(1);
        assertNotNull(user);
        assertEquals(1,user.getId());
        assertEquals("javaboy",user.getUsername());
    }


    @Test
    @WithMockUser(roles = "ADMIN")
    void securedTest01() {
        User user = helloService.getUserByUsername("javaboy");
        assertNotNull(user);
        assertEquals(99,user.getId());
        assertEquals("javaboy", user.getUsername());
    }


    @Test
    @WithMockUser(username = "javaboy")
    void denyAllTest01() {
        helloService.denyAll();
    }


    @Test
    @WithMockUser(username = "javaboy")
    void permitAllTest01() {
        String s = helloService.permitAll();
        assertNotNull(s);
        assertEquals("PermitAll", s);
    }


    @Test
    @WithMockUser(roles = "ADMIN")
    void rolesAllowedTest01() {
        String s = helloService.rolesAllowed();
        assertNotNull(s);
        assertEquals("RolesAllowed", s);
    }

}
