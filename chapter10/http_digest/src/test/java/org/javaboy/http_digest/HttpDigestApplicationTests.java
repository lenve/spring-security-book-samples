package org.javaboy.http_digest;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.codec.Hex;
import org.springframework.security.crypto.password.MessageDigestPasswordEncoder;
import org.springframework.util.DigestUtils;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

@SpringBootTest
class HttpDigestApplicationTests {

    @Test
    void contextLoads() throws NoSuchAlgorithmException {
        String rawPassword = "javaboy:myrealm:123";
        MessageDigest digest = MessageDigest.getInstance("MD5");
        String s = new String(Hex.encode(digest.digest(rawPassword.getBytes())));
        System.out.println(s);
    }

}
