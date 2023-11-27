package com.example.string;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class LeftRotateByKTest {
    @Test
    public void test() {
        LeftRotateByK obj = new LeftRotateByK();
        assertEquals("cdab", obj.leftRotateString("abcd", 2));
        assertEquals("xmn", obj.leftRotateString("xmn", 0));
    }
}
