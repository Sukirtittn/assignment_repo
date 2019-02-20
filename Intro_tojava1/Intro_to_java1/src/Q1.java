import java.util.Scanner;

public class Q1 {
    public void replace_string() {
        System.out.println("Question No-1\n");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your string:\n");
        String input_String = sc.next();
        if (input_String.contains("sub")) {
            System.out.println("replaced string :\n");
            System.out.println(input_String.replace("sub", "newsub"));
        }
    }
}
