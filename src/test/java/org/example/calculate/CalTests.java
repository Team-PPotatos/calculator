package org.example.calculate;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CalTests {
    @DisplayName("덧셈 계산")
    @Test
    public void testAdd() {

        Calculator calculator  = new Calculator();
        calculator.add(10);
        int add = calculator.getAdd();

        Assertions.assertEquals(10,  add);
    }
}
