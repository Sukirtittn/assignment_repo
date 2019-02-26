import java.util.*;
public class Q3 {
    public void Characters_and_their_count(String s) {
    HashMap<Character,Integer> character_count=new HashMap<>();
        char[] characs = s.toCharArray();
        for (char c : characs) {
            if (character_count.containsKey(c)) {
                character_count.put(c, character_count.get(c) + 1);
            }
            else {
                character_count.put(c, 1);
            }
        }
        System.out.println(character_count.entrySet());
    }
    public static void main(String[] args) {
        Q3 q=new Q3();
        q.Characters_and_their_count("abvcabcdf");
    }
}

