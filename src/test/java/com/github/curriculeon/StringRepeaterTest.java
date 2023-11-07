package com.github.curriculeon;

import org.junit.Assert;
import org.junit.Test;

public class StringRepeaterTest  {
    private void test(int numberOfRepeats, String stringToRepeat, String expected) {
        // given
        StringRepeater stringRepeater = new StringRepeater();

        // when
        String actual = stringRepeater.stringRepeater(numberOfRepeats,  stringToRepeat);

        // then
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void test1() {
        test(6, "I", "IIIIII");
    }

    @Test
    public void test2() {
        test(5, "Hello", "HelloHelloHelloHelloHello");
    }
}

