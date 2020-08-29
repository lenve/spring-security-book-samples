package org.javaboy.passwordencoder;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.password.PasswordEncoder;

@SpringBootApplication
public class PasswordencoderApplication {

    public static void main(String[] args) {
        SpringApplication.run(PasswordencoderApplication.class, args);
    }

}
