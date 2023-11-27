package com.example.string;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CheckKAnagramsTest {
    @Test
    public void test() {
        CheckKAnagrams obj = new CheckKAnagrams();
        assertEquals(true, obj.areKAnagrams("fodr", "gork", 2));
        assertEquals(false, obj.areKAnagrams("fodr", "gork", 1));
        assertEquals(false, obj.areKAnagrams("dhruv", "kharkwal", 1));
    }
}
