/*
 * Name: Somnath Shaw
 * Reg No: 2241019426
 * PS LINK: https://cses.fi/problemset/task/1094
 */

import java.util.Scanner;

public class Q4_1094 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        int[] arr = new int[(int) n];
        for(int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        long sum = 0;
        for(int i = 1; i < n; i++) {
            if(arr[i] < arr[i-1]) {
                sum += Math.abs(arr[i] - arr[i-1]);
                arr[i] = arr[i-1];
            }
        }
        System.out.println(sum);
    }
}