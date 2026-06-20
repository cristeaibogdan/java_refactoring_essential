package com.codemanship.refactoring.comments;

public class X1 {

    static int m(int lowerBound, int upperBound) {
        int sum = 0;

        for (int i = lowerBound; i <= upperBound; i++) {
            // Add square of each number in the range
            sum += calculateSquare(i);
        }

        return sum;
    }

    static int calculateSquare(int k) {
        return k * k;
    }
}
