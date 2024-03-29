package org.example.calculate;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CalTests {
    Calculator calculator = new Calculator();

    @DisplayName("계산식에 0이 존재할 때 테스트")
    @Test
    public void divideBy0() {
        

        /* divide By Zero 뜨지 않고 0 출력 */
        Assertions.assertDoesNotThrow(() -> calculator.divide(5, 0));
    }

    @DisplayName("정수 - 정수로 나누기 테스트")
    @Test
    public void divideNumber() {
        Calculator calculator = new Calculator();
        int result = calculator.divide(10, 3);

        /* 10 / 3 == 3 */
        Assertions.assertEquals(3, result);
    }
  
    @DisplayName("덧셈 계산")
    @Test
    public void testAdd() {

        calculator.add(10);
      
        int add = calculator.getAdd();

        Assertions.assertEquals(10,  add);
    }
  
    @DisplayName("기본 값에서 입력한 값을 빼는 연산의 결과")
    @Test
    public void testMinus() {

        calculator.minus(100);

        int answer = calculator.getMinus();

        Assertions.assertEquals(-90, answer);
    }

    @DisplayName("기본 값에서 입력한 값을 곱하는 연산의 결과")
    @Test
    public void testMultiple() {

        calculator.multiple(10);

        int answer = calculator.getMultiple();

        Assertions.assertEquals(100, answer);

    }

    @DisplayName("곱하기 연산의 경우 B가 0인지 여부 확인")
    @Test
    public void testMultipleZero() {

        Assertions.assertThrows(IllegalArgumentException.class, () -> calculator.multiple(0));

    }
}
