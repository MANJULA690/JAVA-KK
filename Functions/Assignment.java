import java.util.*;

public class Assignment {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        max(1, 2, 3);
        min(1, 2, 3);
        evenOdd(12);
        evenOdd(13);
        canVote(16);
        canVote(26);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        System.out.println(sum(num1, num2));
        System.out.println(prod(num1, num2));
        circle(5);
        System.out.println(isPrime(12));
        System.out.println(isPrime(13));
        System.out.println(isPrime(2));
        System.out.println(isPrime(1));
        grade(86);
        System.out.println(factorial(5));
        System.out.println(isPalindrome(123));
        System.out.println(isPalindrome(121));
        System.out.println(nSum(5));
        primesInRange(1, 10);
        System.out.println(pythagorean_triplet(1, 2, 3));
    }

    static void max(int a, int b, int c) {
        int max = a;
        if (max < b)
            max = b;
        if (max < c)
            max = c;
        System.out.println(max);
    }

    static void min(int a, int b, int c) {
        int min = a;
        if (min > b)
            min = b;
        if (min > c)
            min = c;
        System.out.println(min);
    }

    static void evenOdd(int n) {
        if (n % 2 == 0) {
            System.out.println("even number");
        } else {
            System.out.println("odd number");
        }
    }

    static void canVote(int age) {
        if (age >= 18) {
            System.out.println("can vote");
        } else {
            System.out.println("cannot vote");
        }
    }

    static int sum(int a, int b) {
        return a + b;
    }

    static int prod(int a, int b) {
        return a * b;
    }

    static void circle(double rad) {
        double circumference = 2 * Math.PI * rad;
        double area = Math.PI * (rad * rad);
        System.out.println(circumference);
        System.out.println(area);
    }

    static boolean isPrime(int n) {
        if (n <= 1)
            return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    static void grade(int marks) {
        if (marks >= 91 && marks <= 100) {
            System.out.println("AA");
        } else if (marks >= 81 && marks <= 90) {
            System.out.println("AB");
        } else if (marks >= 71 && marks <= 80) {
            System.out.println("BB");
        } else if (marks >= 61 && marks <= 70) {
            System.out.println("BC");
        } else if (marks >= 51 && marks <= 60) {
            System.out.println("CD");
        } else if (marks >= 41 && marks <= 50) {
            System.out.println("DD");
        } else {
            System.out.println("FAIL");
        }
    }

    static int factorial(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

    static boolean isPalindrome(int n) {
        int temp = n;
        int sum = 0;
        while (n > 0) {
            sum = sum * 10 + n % 10;
            n /= 10;
        }
        return sum == temp;
    }

    static int nSum(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }

    static void primesInRange(int a, int b) {
        for (int i = a; i <= b; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    static boolean pythagorean_triplet(int a, int b, int c) {
        if (a + b == c || b + c == a || a + c == b) {
            return true;
        }
        return false;
    }
}
