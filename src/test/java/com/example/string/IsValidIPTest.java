package com.example.string;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class IsValidIPTest {
    @Test
    public void test() {
        IsValidIP obj = new IsValidIP();
        assertEquals(0, obj.isValid("222.111.111.111.1132"));
        assertEquals(0, obj.isValid("5555..555"));
        assertEquals(0, obj.isValid("0000.0000.0000.0000"));
        assertEquals(1, obj.isValid("1.1.1.1"));
        assertEquals(0, obj.isValid("12345."));
        assertEquals(0, obj.isValid("010.010.010.010"));
        assertEquals(1, obj.isValid("192.168.0.1"));
        assertEquals(0, obj.isValid("192..0.1"));
    }
}
