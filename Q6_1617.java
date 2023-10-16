/*
 * Name: Somnath Shaw
 * Reg No: 2241019426
 * PS LINK: https://cses.fi/problemset/task/1617
 */


import java.util.Scanner;

public class Q6_1617 {

    public static long bitStrings(long n) {
        long ans = 1;
        for(int i = 0; i < n; i++) {
            ans = (ans*2) % 1000000007;
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextInt();
        System.out.println(bitStrings(n));
    }
}