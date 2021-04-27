package com.thoughtworks.devday.tdd;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class StringCalculatorTest {
    private StringCalculator stringCalculator;

    @Before
    public void setup(){
        stringCalculator = new StringCalculator();
    }

    @Test
    public void shouldAssert() {
        String input = "";


        Assert.assertTrue(false);
    }
}
