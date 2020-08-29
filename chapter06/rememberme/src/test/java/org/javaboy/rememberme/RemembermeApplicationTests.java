package org.javaboy.rememberme;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.UnsupportedEncodingException;
import java.util.Base64;

@SpringBootTest
class RemembermeApplicationTests {

    @Test
    void contextLoads() throws UnsupportedEncodingException {
        Base64.Decoder decoder = Base64.getDecoder();
        byte[] bytes = decoder.decode("amF2YWJveToxNTk4MzIyMTQ4MzA1OjQxYTMxYWFhZTg1MDg0ZjNlZDY1MWYwOTJiYjAyZTU4");
        String s = new String(bytes, "UTF-8");
        System.out.println("s = " + s);
    }

}
