package com.JPA_study.Controller;

import org.junit.jupiter.api.Test;

import static java.time.Duration.ofSeconds;
import static org.junit.jupiter.api.Assertions.*;

public class junitassertexception {

    /*

      assertEquals 원시타입 비교
      assertArrayEquals 는 배열 비교
      assertSame / assertNotSame 두 변수가 객체를 참조하는 경우
      assertTrue / assertFalse


     */


    @Test
    public void whenExceptionThrown_thenAssertionSucceeds() {
        Exception exception = assertThrows(NumberFormatException.class, () -> {
            Integer.parseInt("1a");
        });

        String expectedMessage = "For input string";
        String actualMessage = exception.getMessage();

        assertTrue(actualMessage.contains(expectedMessage));
    }

    @Test
    public void whenAssertingEquality_thenEqual() {
        String expected = "Baeldung";
        String actual = "Baeldung";

       // assertEquals(expected, actual);

    }


    @Test
    public void whenAssertingArraysEquality_thenEqual() {
        char[] expected = { 'J', 'u', 'p', 'i', 't', 'e', 'r' };
        char[] actual = "Jupiter".toCharArray();

        assertArrayEquals(expected, actual, "Arrays should be equal");
    }

    // assert는 여러 객체를 한번에 실행 가능함
    @Test
    public void givenMultipleAssertion_whenAssertingAll_thenOK() {
        assertAll(
                "heading",
                () -> assertEquals(4, 2 * 2, "4 is 2 times 2"),
                () -> assertEquals("java", "JAVA".toLowerCase()),
                () -> assertEquals(null, null, "null is equal to null")
        );
    }

    @Test
    public void whenAssertingTimeout_thenNotExceeded() {
        assertTimeout(
                ofSeconds(2),
                () -> {
                    // code that requires less then 2 minutes to execute
                    Thread.sleep(3000);
                }
        );
    }
}
