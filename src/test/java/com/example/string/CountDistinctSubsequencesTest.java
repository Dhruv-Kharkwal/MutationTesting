package com.example.string;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class CountDistinctSubsequencesTest {
    @Test
    public void test() {
        CountDistinctSubsequences obj = new CountDistinctSubsequences();
        assertEquals(1, obj.countSub(""));
        assertEquals(2, obj.countSub("a"));
        assertEquals(3, obj.countSub("aa"));
        assertEquals(12, obj.countSub("abab"));
        assertEquals(7, obj.countSub("gfg"));
    }
}
