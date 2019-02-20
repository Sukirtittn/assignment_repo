import java.util.Scanner;
public class Q2 {
    public void duplicate_words_count_and_list() {
        System.out.println("Question No-2\n");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your string:");
        String input_String = sc.nextLine();
        String[] word_list = input_String.split(" ");
        int count = 1;
        for (int i = 0; i < word_list.length; i++) {
            for (int j = i + 1; j < word_list.length; j++) {
                if (word_list[i].equals(word_list[j])) {
                    count = count + 1;
                    word_list[j] = "";
                }
            }
            if (word_list[i] != "")
                System.out.println("word is "+word_list[i] + " it's count in string: " + count);
            count = 1;
        }
    }
}
