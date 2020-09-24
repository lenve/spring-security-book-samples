package org.javaboy.exception_translation_filter;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.web.util.ThrowableAnalyzer;

import javax.servlet.ServletException;
import java.io.IOException;
import java.util.Arrays;

@SpringBootTest
class ExceptionTranslationFilterApplicationTests {

    @Test
    void contextLoads() {
        NullPointerException aaa = new NullPointerException("aaa");
        ServletException bbb = new ServletException(aaa);
        IOException ccc = new IOException(bbb);
        ThrowableAnalyzer throwableAnalyzer = new ThrowableAnalyzer();
        Throwable[] causeChain = throwableAnalyzer.determineCauseChain(ccc);
        for (int i = 0; i < causeChain.length; i++) {
            System.out.println("causeChain[i].getClass() = " + causeChain[i].getClass());
        }
    }

}
