package org.example.controls.example_1;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[] arr = new int[25];
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(11);
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(result(arr));
    }
    public static String result(int[] arr) {
        StringBuilder res = new StringBuilder();
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > arr[i - 1]) {
                res.append(arr[i]).append(" > ").append(arr[i - 1]).append("\n");
            }
            else if (arr[i] < arr[i - 1]) {
                res.append(arr[i]).append(" < ").append(arr[i - 1]).append("\n");
            } else res.append(arr[i]).append(" = ").append(arr[i - 1]).append("\n");
        }
        return res.toString().trim();
    }
}
