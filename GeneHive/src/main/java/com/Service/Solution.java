package com.Service;

/**
 * Created by silvana.albert on 10/12/15.
 */
public class Solution {
    public int solution(int[] A) {
        // write your code in Java SE 8
        int min = Integer.MAX_VALUE;
        int currentSum;
        if(A.length == 1){
            return A[0];
        }
        if(A.length == 0){
            return 0;
        }
        for (int i =1; i< A.length; i++) {
            currentSum = Math.abs(computeSum(A, 0, i) - computeSum(A, i, A.length));
            if(currentSum < min){
                min = currentSum;
            }
        }
        return min;
    }
    public int computeSum (int[] A, int startPos, int endPos) {
        int sum = 0;
        for (int i = startPos; i< endPos; i++) {
            sum = sum + A[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] A = new int[7];
        A[0] = 3;
        A[1] = 1;
        A[2] = 2;
        A[3] = 4;
        A[4] = 3;
//        A[5] = -1001;
//        A[6] = 1000;
        System.out.print("Solution is:" + solution.solution(A));

    }
}
