package com.JPA_study.Controller;

import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertTrue;



public class RunWithTest {

        @Test
        void whenCallingSayHello_thenReturnHello() {
            assertTrue("Hello".equals(Greetings.sayHello()));
        }


}
