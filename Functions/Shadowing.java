public class Shadowing {
    static int x = 20;

    public static void main(String[] args) {
        System.out.println(x); // 20
        int x; // declaration
        // System.out.println(x); error : scope begins after initialisation
        x = 10; // initialisation
        System.out.println(x); // 10
        x = 40;
        System.out.println(x); // 40
        func(); // 20
    }

    static void func() {
        System.out.println(x);
    }
}