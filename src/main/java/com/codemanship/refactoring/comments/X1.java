package com.codemanship.refactoring.comments;

public class X1 {

    static int m(int lowerBound, int upperBound) {
        int p = 0;

        // Iterate from lower bound (q) to upper bound (upperBound)
        for (int i = lowerBound; i <= upperBound; i++) {
            // Add square of each number in the range
            p += calculateSquare(i);
        }

        // Return accumulated sum
        return p;
    }

    static int calculateSquare(int k) {
        return k * k;
    }
}
