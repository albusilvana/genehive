package com.codility.powerhouse;

import java.util.Arrays;

/**
 * Created by silvana.albert on 10/19/15.
 */
public class Test3 {


    public int solution(int[] A) {
        // write your code in Java SE 8
        Arrays.sort(A);
        int sum = 0;
        for (int i = 0; i <= A.length; i++) {
            sum = sum + fib(A, i);
        }
        return sum;
    }

    public int fib(int[] A, int i) {
        if (i == 0) {
            return A[i];
        } else if (i == 1) {
            return A[i] + A[i - 1];
        } else {
            return fib(A, i-2) + fib(A, i-1);
        }

    }

//    public static long fib(int n) {
//        if (n <= 1) return n;
//        else return fib(n-1) + fib(n-2);
//    }

    public static void main(String[] args) {
        Test3 test3 = new Test3();
        int[] a = new int[3];
        a[0] = 100;
        a[1] = 250;
        a[2] = 1000;

        System.out.print(test3.solution(a));
    }
}
