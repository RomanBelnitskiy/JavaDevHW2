package org.example;

public class SumCalculator {
    public int sum(int n) {
        if (n <= 0) {
            throw new IllegalArgumentException();
        }

        int result = 0;
        for (int i = n; i > 0; i--) {
            result += i;
        }

        return result;
    }
}
