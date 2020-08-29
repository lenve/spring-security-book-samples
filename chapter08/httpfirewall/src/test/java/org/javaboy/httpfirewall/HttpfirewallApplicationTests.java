package org.javaboy.httpfirewall;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Collections;
import java.util.HashSet;

@SpringBootTest
class HttpfirewallApplicationTests {

    @Test
    void contextLoads() {
//        boolean b = containsOnlyPrintableAsciiCharacters("~");
//        System.out.println(b);
        char c1 = '\u0020';
        char c2 = '\u007e';
        System.out.println((int) c1);
        System.out.println((int)c2);
    }

    private static boolean containsOnlyPrintableAsciiCharacters(String uri) {
        int length = uri.length();
        for (int i = 0; i < length; i++) {
            System.out.println(i);
            char c = uri.charAt(i);
            if (c < '\u0020' || c > '\u007e') {
                return false;
            }
        }

        return true;
    }
}
