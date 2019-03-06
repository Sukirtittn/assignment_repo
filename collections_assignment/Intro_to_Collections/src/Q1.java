import java.util.ArrayList;
import java.util.Iterator;
public class Q1 {
    public static void main(String[] args) {
        Float sum=0.0f;
        ArrayList<Float> list=new ArrayList<>();
        list.add(2.34f);
        list.add(3.44f);
        list.add(4.54f);
        list.add(6.64f);
        list.add(7.73f);
        Iterator iterator=list.iterator();
        while (iterator.hasNext()){
           sum=sum+(Float)iterator.next();
        }
        System.out.println("Sum of 5 floating point no is: "+sum);
    }
}
