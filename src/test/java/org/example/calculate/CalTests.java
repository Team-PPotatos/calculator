package org.example.calculate;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CalTests {
    @DisplayName("계산식에 0이 존재할 때 테스트")
    @Test
    public void divideBy0() {
        Calculator calculator = new Calculator();

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
}
