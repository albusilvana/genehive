package com.Service;

/**
 * Created by silvana.albert on 10/12/15.
 */
public class NewSolution {
    int solution(int X, int Y, int D) {
        // write your code in C99
        int count =0;
        if (X < 1 || Y< 1 || D<1){
            return 0;
        }

        for(int i = X; i<Y; i=i+D){
            X = X+D;
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        NewSolution solution = new NewSolution();
        System.out.print(solution.solution(1, 5, 2));
    }
}
