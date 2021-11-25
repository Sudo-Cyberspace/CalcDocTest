package com.example.caculator;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    MainActivity o = new MainActivity();
    @Test
    public void addition_isCorrect() {
        o.value=3;
       assertEquals(20,o.finalResult(-40,60),0.0f);
    }
    @Test
    public void subtraction_isCorrect() {
        o.value=2;
        assertEquals(-100,o.finalResult(-40,60),0.0f);
    }
    @Test
    public void multiplication_isCorrect() {
        o.value=1;
        assertEquals(4,o.finalResult(2,2),0.0f);
    }
    @Test
    public void division_isCorrect() {
        o.value=4;
        assertEquals(1.75,o.finalResult(7,4),0.00f);
    }
}
