package org.example.calculate;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CalTests {

    @DisplayName("기본 값에서 입력한 값을 빼는 연산의 결과")
    @Test
    public void testMinus(){

        Calculator calculator = new Calculator();

        calculator.minus(100);

        int answer = calculator.getMinus();

        Assertions.assertEquals(-90, answer);
    }

    @DisplayName("기본 값에서 입력한 값을 곱하는 연산의 결과")
    @Test
    public void testMultiple(){

        Calculator calculator = new Calculator();

        calculator.multiple(100);

        int answer = calculator.getMultiple();

        Assertions.assertEquals(1000, answer);
    }
}
