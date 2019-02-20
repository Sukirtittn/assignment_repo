import java.util.Scanner;
public class Q8 {
    public void rreverse_and_remove_string() {
        System.out.println("Question No-8\n");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your string:\n");
        String input_String = sc.nextLine();
        StringBuffer sb=new StringBuffer(input_String);
        StringBuffer sb1=sb.reverse();
        System.out.println("After reverse string is: "+sb1);
        StringBuffer sb2=sb1.delete(4,9);
        System.out.println("after reversing and remving characters from index 4-9 string is: "+sb2);
    }
}
