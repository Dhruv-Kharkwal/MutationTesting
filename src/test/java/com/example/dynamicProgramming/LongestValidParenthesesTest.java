package com.example.dynamicProgramming;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class LongestValidParenthesesTest {

    @Test
    public void test() {
        LongestValidParentheses obj = new LongestValidParentheses();
        assertEquals(0, obj.getLongestValidParentheses("("));
        assertEquals(0, obj.getLongestValidParentheses(")"));
        assertEquals(2, obj.getLongestValidParentheses("()"));
        assertEquals(0, obj.getLongestValidParentheses(""));
        assertEquals(6, obj.getLongestValidParentheses("()()()"));
        assertEquals(8, obj.getLongestValidParentheses("(())(())((()"));

    }
}