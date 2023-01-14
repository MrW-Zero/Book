package com.wztcode.test;

import com.wztcode.utils.JdbcUtils;
import org.junit.Test;

public class JdbcUtilsTest {

    @Test
    public void test() {
        for (int i = 0; i < 100; i++) {
            System.out.println(JdbcUtils.getConnection());
        }
    }
}
