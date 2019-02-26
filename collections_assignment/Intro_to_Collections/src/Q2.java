import java.util.HashSet;
import java.util.Set;
public class Q2 {
    public int unique_Character(String s)
    {
        Set set=new HashSet();
        int n=0;
        for(int i=0;i<s.length();i++){
        set.add(s.charAt(i))   ;
        }
        return set.size();
    }
    public static void main(String[] args) {
        Q2 q=new Q2();
        int n=q.unique_Character("sukirti");
        System.out.println("No of Unique Characters in given string is "+n);
    }
}
