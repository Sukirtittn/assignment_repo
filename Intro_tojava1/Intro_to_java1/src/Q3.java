import java.util.Scanner;
public class Q3 {
    public void count_Character(){
        System.out.println("Question No-3\n");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your string here:\n");
        String input_String = sc.nextLine();
        System.out.println("here we are counting character 'a'!\n");
        int countA = input_String.length() - input_String.replaceAll("a","").length();
        System.out.println("Count of character a  : " + countA);
    }
}
