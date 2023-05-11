package org.example.calculate;

public class Calculator {

    public int divide(int a, int b) {
        if (a == 0 || b == 0) { // 계산식에 0이 존재할 경우 0 return
            return 0;
        } else {
            return a / b;
        }
    }
}
