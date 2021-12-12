package com.JPA_study.Controller;


import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;


/*

1. Junit5 는 Java8  부터 사용되는 람다식을 지원함

2. BeforeEach 와 BeforeAll 의 차이점
 - @BeforeEach 각 테스트 마다 메소드 실행
 - @BeforeAll 테스트 실행 전 한번만 실행 (전체 메소드에 영향을 주기 때문에 static 상태여야 한다.)

3. Junit5 는 2가지의 예외 테스트가 존재
 - 세부정보 확인용
 - 예외 유형 유효성 확인

4. Junit5 에서는 Junit4의 @RunWith ->  @ExtendWith 으로 변경됨
그러나 @RunWith 주석은 이전 버전과의 호환성을 위해 JUnit5에서 계속 사용가능
 */

public class Junit5_Intro {

    @Test
    public void testAdd() {
        // assertEquals(42, Integer.sum(19, 23));

        assertThrows(ArithmeticException.class, () -> {
            Integer.divideUnsigned(42, 0);
        });
    }

    @Tag("slow")
    @Test
    public void testAddMaxInteger(){

        assertEquals(2147483646, Integer.sum(2147183646, 300000));

    }

    @Tag("fast")
    @Test
    public void testDivide() {
        assertThrows(ArithmeticException.class, () -> {
            Integer.divideUnsigned(42, 0);
        });
    }

}