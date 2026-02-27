import java.util.*;

public class conditionals_loops {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // highest of 3
        // int a = sc.nextInt();
        // int b = sc.nextInt();
        // int c = sc.nextInt();
        // int max = a;
        // if (max < b)
        // max = b;
        // if (max < c)
        // max = c;
        // System.out.println(max);

        // lower/upper case character
        // char ch = sc.next().trim().charAt(0);
        // if (ch >= 'a' && ch <= 'z') {
        // System.out.println("lower case");
        // } else {
        // System.out.println("upper case");
        // }

        // nth fibonacci number
        // int n = sc.nextInt();
        // int a = 0, b = 1;
        // for (int i = 0; i < n - 1; i++) {
        // int sum = a + b;
        // a = b;
        // b = sum;
        // }
        // System.out.println(b);

        // occurence of a digit in a number
        // int n = sc.nextInt();
        // int target = sc.nextInt();
        // int count = 0;
        // while (n > 0) {
        // if (n % 10 == target) {
        // count++;
        // }
        // n /= 10;
        // }
        // System.out.println(count);

        // reverse of a number
        // int n = sc.nextInt();
        // int rev = 0;
        // while (n > 0) {
        // rev = (rev * 10) + (n % 10);
        // n /= 10;
        // }
        // System.out.println(rev);

        // calculator program
        while (true) {
            char op = sc.next().trim().charAt(0);
            if (op == '+' || op == '-' || op == '*' || op == '/' || op == '%') {
                int a = sc.nextInt();
                int b = sc.nextInt();
                if (op == '+')
                    System.out.println(a + b);
                if (op == '-')
                    System.out.println(a - b);
                if (op == '*')
                    System.out.println(a * b);
                if (op == '/')
                    System.out.println(a / b);
                if (op == '/' && b != 0)
                    System.out.println(a % b);
            } else if (op == 'x' || op == 'X') {
                System.out.println("Enter valid input");
                break;
            }
        }
    }
}