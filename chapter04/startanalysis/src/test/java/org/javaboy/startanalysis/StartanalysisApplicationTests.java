package org.javaboy.startanalysis;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.LinkedHashMap;

@SpringBootTest
class StartanalysisApplicationTests {

    @Test
    void contextLoads() {
        ArrayList<Object> list = new ArrayList<>(1);
        list.add(1);
        list.add(1);
        list.add(1);
        System.out.println(list);
    }

}
