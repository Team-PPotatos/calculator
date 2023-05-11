package org.example.calculate;

public class Calculator {
    int a = 10;
    public void minus(int b) {
        this.a -= b;
    }

    public int getMinus() {
        return this.a;
    }

    public void multiple(int b) {
        if (b == 0){
            throw new IllegalArgumentException("0으로 곱하면 무조건 0이 나옵니다. 다른 값을 입력해주세요.");
        } else {
            this.a = this.a * b;
        }
    }

    public int getMultiple() {
        return this.a;
    }
}
