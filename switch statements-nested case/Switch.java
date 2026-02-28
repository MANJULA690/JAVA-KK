import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String fruit = sc.next();

        // switch (fruit) {
        // case "mango":
        // System.out.println("King of fruits");
        // break;
        // case "banana":
        // System.out.println("yellow fruit");
        // break;
        // case "apple":
        // System.out.println("a apple a day keeps the doctor away");
        // break;
        // default:
        // System.out.println("no fruit, bye bye");
        // }

        // enhanced switch statement
        // switch (fruit) {
        // case "mango" -> System.out.println("king of fruits");
        // case "apple" -> System.out.println("a apple a day keeps the doctor away");
        // case "banana" -> System.out.println("yellow fruit");
        // default -> System.out.println("no fruit, bye bye");
        // }

        // nested switch case

        switch (fruit) {
            case "mango" -> System.out.println("king of fruits");
            case "apple" -> System.out.println("a apple a day keeps the doctor away");
            case "banana" -> System.out.println("yellow fruit");
            default -> {
                System.out.print(
                        "you entered other fruit , which is : " + fruit
                                + ", so tell us if u like that fruit or not : ");
                String fav = sc.next();
                switch (fav) {
                    case "yes" -> System.out.println("u like the fruit : " + fruit);
                    case "no" -> System.out.println("u don't like the fruit : " + fruit);
                    default -> System.out.println("no comments");
                }
            }
        }
    }
}