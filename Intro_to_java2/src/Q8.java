import java.util.Scanner;
public class Q8 {
    static Scanner scanner = new Scanner(System.in);

    public static void while_loop(String input_word) {

        while (!input_word.equals("done")) {

            if (input_word.charAt(0) == input_word.charAt(input_word.length() - 1))
                System.out.println("First & Last character are equal");
            else
                System.out.println("First & Last character are not equal");
            System.out.print("Enter input_word : ");
            input_word = scanner.next();
            input_word = input_word.toLowerCase();
        }
        System.out.println("while loop ended");
    }
    public static void doWhile_loop(String input_word) {
        do {
            if (input_word.equals("done"))
                break;
            if (input_word.charAt(0) == input_word.charAt(input_word.length() - 1))
                System.out.println("First & Last character are equal");
            else
                System.out.println("First & Last character are not equal");
            System.out.print("Enter word : ");
            input_word = scanner.next();
            input_word = input_word.toLowerCase();
        } while (!input_word.equals("done"));
        System.out.println("do while loop ended");
    }
    public static void main(String[] args) {

        String input_word = "";
        System.out.print("Enter input_word : ");
        input_word = scanner.next();
        input_word = input_word.toLowerCase();
        doWhile_loop(input_word);
        while_loop(input_word);

    }

}