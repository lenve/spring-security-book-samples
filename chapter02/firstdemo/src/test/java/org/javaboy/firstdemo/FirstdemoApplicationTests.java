package org.javaboy.firstdemo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

@SpringBootTest
class FirstdemoApplicationTests {

    @Test
    void contextLoads() {
        List<String> names1 = new ArrayList<>();
        List<String> names2 = new ArrayList<>();
        List<String> names3 = new ArrayList<>();
        names1.add("zhangsan1");
//        names1.add("zhangsan2");
//        names1.add("zhangsan3");
        names2.add("lisi1");
        names2.add("lisi2");
        names2.add("lisi3");
        names3.add("wangwu1");
        names3.add("wangwu2");
        names3.add("wangwu3");
        hello(names1);
    }

    public <T> void hello(T... names) {
        for (T name : names) {
            System.out.println("name = " + name);
        }
    }
}
