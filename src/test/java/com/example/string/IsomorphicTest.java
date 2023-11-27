package com.example.string;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class IsomorphicTest {
    @Test
    public void test() {
        Isomorphic obj = new Isomorphic();
        assertEquals(true, obj.areIsomorphic("aac", "xxy"));
        assertEquals(true, obj.areIsomorphic("fodr", "gork"));
        assertEquals(false, obj.areIsomorphic("dhruv", "kharkwal"));
    }
}
