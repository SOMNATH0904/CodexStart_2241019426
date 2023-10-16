/*
 * Name: Somnath Shaw
 * Reg No: 2241019426
 * PS LINK: https://cses.fi/problemset/task/1618
 */


import java.util.Scanner;

public class Q8_1618 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextInt();
        long count = 0;
        while(n != 0) {
            count += (n/5);
            n /= 5;
        }
        System.out.println(count);
    }
}