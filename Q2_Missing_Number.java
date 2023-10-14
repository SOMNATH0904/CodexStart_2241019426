import java.util.Scanner;

public class Q2_Missing_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long sum = (n*(n+1))/2;
        for(int i = 0; i < n-1; i++) {
            long temp = sc.nextLong();
            sum = sum - temp;
        }
        System.out.println(sum);
    }
}
