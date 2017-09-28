package com.codility.TimeComplexity;

/**
 * Created by silvana.albert on 10/14/15.
 */
//A non-empty zero-indexed array A consisting of N integers is given. Array A represents numbers on a tape.
//
//        Any integer P, such that 0 < P < N, splits this tape into two non-empty parts: A[0], A[1], ..., A[P − 1] and A[P], A[P + 1], ..., A[N − 1].
//
//        The difference between the two parts is the value of: |(A[0] + A[1] + ... + A[P − 1]) − (A[P] + A[P + 1] + ... + A[N − 1])|
//
//        In other words, it is the absolute difference between the sum of the first part and the sum of the second part.
//
//        For example, consider array A such that:
//
//        A[0] = 3
//        A[1] = 1
//        A[2] = 2
//        A[3] = 4
//        A[4] = 3
//        We can split this tape in four places:
//
//        P = 1, difference = |3 − 10| = 7
//        P = 2, difference = |4 − 9| = 5
//        P = 3, difference = |6 − 7| = 1
//        P = 4, difference = |10 − 3| = 7
//        Write a function:
//
//        int solution(int A[], int N);
//
//        that, given a non-empty zero-indexed array A of N integers, returns the minimal difference that can be achieved.
//
//        For example, given:
//
//        A[0] = 3
//        A[1] = 1
//        A[2] = 2
//        A[3] = 4
//        A[4] = 3
//        the function should return 1, as explained above.
//
//        Assume that:
//
//        N is an integer within the range [2..100,000];
//        each element of array A is an integer within the range [−1,000..1,000].
//        Complexity:
//
//        expected worst-case time complexity is O(N);
//        expected worst-case space complexity is O(N), beyond input storage (not counting the storage required for input arguments).
//        Elements of input arrays can be modified. 50%
public class TapeEquilibrium {
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
        int i= 1;
        while (i< A.length) {
            currentSum = Math.abs(computeSum(A, 0, i) - computeSum(A, i, A.length));
            if(currentSum < min){
                min = currentSum;
            }
            i++;
        }
        return min;
    }
    public int computeSum (int[] A, int startPos, int endPos) {
        int sum = 0;
        int i = startPos;
        while ( i< endPos) {
            sum = sum + A[i];
            i++;
        }
        return sum;
    }

    public static void main(String[] args) {
        TapeEquilibrium solution = new TapeEquilibrium();
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


//    int eq = -1;

//    if (A.length == 0) return eq;
//    int first[] = new int[A.length];
//    int second[] = new int[A.length];
//    second[A.length - 1] = A[A.length - 1];
//
//    first[0] = A[0];
//    for (int i = 1; i < A.length; i++) {
//        first[i] = first[i - 1] + A[i];
//        second[A.length - i - 1] = second[A.length - i] + A[A.length - i];
//    }
//
//    for (int i = 0; i < A.length; i++) {
//        if (first[i] == second[i]) {
//            return i;
//        }
//    }
//
//    return eq;
}
