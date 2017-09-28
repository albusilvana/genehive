package com.codility.TimeComplexity;

/**
 * Created by silvana.albert on 10/13/15.
 */
public class FrogJmp {
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
}
