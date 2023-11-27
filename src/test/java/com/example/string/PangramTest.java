package com.example.string;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class PangramTest {
    @Test
    public void test() {
        Pangram obj = new Pangram();
        assertEquals(false, obj.checkPangram(""));
        assertEquals(true, obj.checkPangram("abcdefghijklmnopqrstuvwxyz"));
        assertEquals(true, obj.checkPangram("ABCDEFGHIJKLMNOPQRSTUVWXYZ"));
        assertEquals(true, obj.checkPangram("Mr. Jock, TV quiz PhD, bags few lynx."));
        assertEquals(false, obj.checkPangram("The quick brown fox jumps 9 times!"));
        assertEquals(true, obj.checkPangram("The quick brown fox jumps over the lazy dog"));
        assertEquals(false, obj.checkPangram("There Here Where NoWhere"));
        assertEquals(false, obj.checkPangram("12345 Hell NO"));
        assertEquals(true, obj.checkPangram("The quick 34343434 brown fox jumps over the lazy dog"));
        assertEquals(false, obj.checkPangram("abcd efgh ijkl"));
    }
}
