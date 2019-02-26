import java.util.HashMap;
import java.util.*;
public class Q6 {
    public HashMap<Integer,Integer> Characters_and_their_count(int arry[]) {
        HashMap<Integer, Integer> elements_frequency = new HashMap<>();
        for (int i : arry) {
            if (elements_frequency.containsKey(i)) {
                elements_frequency.put(i, elements_frequency.get(i) + 1);
            } else {
                elements_frequency.put(i, 1);
            }

        }
        List<Map.Entry<Integer, Integer> > list = new LinkedList<Map.Entry<Integer, Integer> >(elements_frequency.entrySet());
        Collections.sort(list, new Comparator<Map.Entry<Integer, Integer> >() {
            public int compare(Map.Entry<Integer, Integer> o1,
                               Map.Entry<Integer, Integer> o2)
            {
                return (o2.getValue()).compareTo(o1.getValue());
            }
        });
        HashMap<Integer, Integer> temp = new LinkedHashMap<Integer, Integer>();
        for (Map.Entry<Integer, Integer> aa : list) {
            temp.put(aa.getKey(), aa.getValue());
        }
        return temp;
    }
    public static void main(String[] args) {
        int arry[]={1,2,3,1,5,2,3,1,2,3,4,5,4,5,3,5,4,3,2,4,4,4,};
        Q6 q = new Q6();
        HashMap<Integer,Integer> temp =q.Characters_and_their_count(arry);
        for (Map.Entry<Integer, Integer> i : temp.entrySet()) {
            System.out.println("Array Element = " + i.getKey() +
                    ", Frequency = " + i.getValue());
        }
    }

}

