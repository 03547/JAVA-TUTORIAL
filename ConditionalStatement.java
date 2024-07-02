import java.util.Scanner;

public class ConditionalStatement {
    public static void main(String[] args) {
        // Conditional Statement
        // if, else if,
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        System.out.println(age);
        if (age >= 18) {
            System.out.println("YOU ARE AN ADDULT AND ELIGIBLE TO VOTE");
        } else {
            System.out.println("YOU ARE NOT ADULT AND NOT ELIGIBLE TO VOTE");
        }

    }

}
