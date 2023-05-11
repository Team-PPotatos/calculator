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
        this.a = this.a * b;
    }

    public int getMultiple() {
        return this.a;
    }
}
