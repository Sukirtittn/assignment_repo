import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

public class EmpQ4{
    String name;
    double age;
    double salary;

    EmpQ4(String n, double a, double sal) {
        name = n;
        age = a;
        salary = sal;
    }

    public String toString() {
        return "name: " + name + " " + "age :" + age + " salary: " + salary;
    }

    public static void main(String[] args) {
        EmpQ4 e1 = new EmpQ4("Sukirti", 23, 10000);
        EmpQ4 e2 = new EmpQ4("Sukirti1", 24, 35000);
        EmpQ4 e3 = new EmpQ4("Sukirti2", 25, 27000);
        EmpQ4 e4 = new EmpQ4("Sukirti3", 26, 18000);
        EmpQ4 e5 = new EmpQ4("Sukirti4", 27, 8000);

        ArrayList<EmpQ4> ar = new ArrayList<EmpQ4>();
        ar.add(e1);
        ar.add(e2);
        ar.add(e4);
        ar.add(e3);
        ar.add(e5);
        Collections.sort(ar, new Comparator<EmpQ4>() {
            @Override
            public int compare(EmpQ4 o1, EmpQ4 o2) {
                return (int) (o2.salary - o1.salary);
            }
        });
        Iterator<EmpQ4> iterator = ar.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}


