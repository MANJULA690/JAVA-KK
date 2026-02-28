import java.util.*;

public class Assignment {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();

        // factorial of anumber
        // long fact = 1;
        // for (int i = 1; i <= n; i++) {
        // fact *= i;
        // }
        // System.out.println(fact);

        // average of n number
        // int sum = 0;
        // for (int i = 1; i <= n; i++) {
        // sum += i;
        // }
        // double avg = sum / n;
        // System.out.println(avg);

        // perfect number
        // int sum = 0;
        // for (int i = 1; i < n; i++) {
        // if (n % i == 0) {
        // sum += i;
        // }
        // }
        // if (sum == n) {
        // System.out.println("perfect number");
        // } else {
        // System.out.println("not perfect");
        // }

        // armstrong number
        // int sum = 0;
        // int length = 0;
        // int temp = n;
        // while (temp > 0) {
        // length++;
        // temp /= 10;
        // }
        // int temp1 = n;
        // while (temp1 > 0) {
        // int digit = temp1 % 10;
        // sum += Math.pow(digit, length);
        // temp1 /= 10;
        // }
        // if (sum == n) {
        // System.out.println("armstrong number");
        // } else {
        // System.out.println("not armstrong number");
        // }

        // leap year
        int year = sc.nextInt();
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            System.out.println("a leap year");
        } else {
            System.out.println("not a leap year");
        }
    }
}
