/*
 * Name: Somnath Shaw
 * Reg No: 2241019426
 * PS LINK: https://cses.fi/problemset/task/1069
 */

import java.util.Scanner;

public class Repetitions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int countCh = 0, maxOcr = 0;
        char ch = str.charAt(0);
        for(int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == ch) {
                countCh++;
            }
            else {
                maxOcr = Math.max(maxOcr, countCh);
                countCh = 1;
                ch = str.charAt(i);
            }
        }
        maxOcr = Math.max(countCh, maxOcr);
        System.out.println(maxOcr);
    }
}