package com.example.string;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MultiplyStringTest {
    @Test
    public void test() {
        MultiplyString obj = new MultiplyString();
        assertEquals("0", obj.multiply("12345", "0"));
        assertEquals("12345", obj.multiply("12345", "1"));
        assertEquals("213739916", obj.multiply("4154", "51454"));
        assertEquals("41549622603955309777243716069997997007620439937711509062916",
                obj.multiply("654154154151454545415415454", "63516561563156316545145146514654"));
    }
}
