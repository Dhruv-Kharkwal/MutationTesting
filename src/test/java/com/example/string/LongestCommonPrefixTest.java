package com.example.string;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class LongestCommonPrefixTest {
    @Test
    public void test() {
        LongestCommonPrefix obj = new LongestCommonPrefix();
        assertEquals("gee", obj.longestCommonPrefix(new String[] { "geeksforgeeks", "geeks", "geek", "geezer" }));
        assertEquals("apple", obj.longestCommonPrefix(new String[] { "applepie", "applejuice", "applecake" }));
        assertEquals("", obj.longestCommonPrefix(new String[] { "", "test", "trial" }));
        assertEquals("hello", obj.longestCommonPrefix(new String[] { "hello", "hello", "hello" }));
        assertEquals("", obj.longestCommonPrefix(new String[] { "dog", "car", "fish" }));
        assertEquals("unique", obj.longestCommonPrefix(new String[] { "unique" }));
        assertEquals("a@bc", obj.longestCommonPrefix(new String[] { "a@bc123", "a@bc456", "a@bc789" }));
        assertEquals("mix", obj.longestCommonPrefix(new String[] { "mixCase", "mixing", "mixed" }));
    }
}
