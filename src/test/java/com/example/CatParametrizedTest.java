package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.List;

import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class CatParametrizedTest {
    private final String catSex;
    private final boolean expected;

public CatParametrizedTest(String catSex, String expected) {
    this.catSex = catSex;
    this.expected = Boolean.parseBoolean(expected);
}
    @Parameterized.Parameters
    public static Object[][] getData() {
        return new Object[][] {
                { "Самка", "false"},
                { "Самец", "true"},

        };
    }

    @Test
    public void doesHaveMane() throws Exception {
        Lion lion = new Lion(catSex);
        assertEquals(expected, lion.doesHaveMane());
    }

}
