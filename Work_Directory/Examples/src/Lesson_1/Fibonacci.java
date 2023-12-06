package Lesson_1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Fibonacci {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(intFibonacci(10)));
    }
    public static int[] intFibonacci(int num) {
        int[] arr = new int[num];
        for (int i = 0; i < num; i++) {
            if (i < 2) {
                arr[i] = 1;
                continue;
            }
            arr[i] = arr[i - 1] + arr[i - 2];
        }
        return arr;
    }
}
