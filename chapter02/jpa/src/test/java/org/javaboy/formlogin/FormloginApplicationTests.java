package org.javaboy.formlogin;

import org.javaboy.formlogin.mapper.UserDao;
import org.javaboy.formlogin.model.Role;
import org.javaboy.formlogin.model.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;

@SpringBootTest
class FormloginApplicationTests {

    @Autowired
    UserDao userDao;
    @Test
    void contextLoads() {
        User u1 = new User();
        u1.setUsername("javaboy");
        u1.setPassword("{noop}123");
        u1.setAccountNonExpired(true);
        u1.setAccountNonLocked(true);
        u1.setCredentialsNonExpired(true);
        u1.setEnabled(true);
        List<Role> rs1 = new ArrayList<>();
        Role r1 = new Role();
        r1.setName("ROLE_admin");
        r1.setNameZh("管理员");
        rs1.add(r1);
        u1.setRoles(rs1);
        userDao.save(u1);
    }
}
