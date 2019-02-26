import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
public class StudentQ5 {
    String name;
    double age;
    double score;
    StudentQ5(String name, double age, double score) {
        this.name = name;
        this.age = age;
        this.score = score;
    }
    public String toString() {
        return "name: " + name + " " + "age :" + age + " score: " + score;
    }
    public static void main(String[] args) {
        StudentQ5 student1 = new StudentQ5("Sukirti", 23, 455);
        StudentQ5 student2 = new StudentQ5("Sukirti1", 24, 378);
        StudentQ5 student3 = new StudentQ5("Sukirti2", 25, 397);
        StudentQ5 student4 = new StudentQ5("Sukirti5", 26, 400);
        StudentQ5 student5 = new StudentQ5("Sukirti4", 27, 400);
        ArrayList<StudentQ5> studentList = new ArrayList<StudentQ5>();
        studentList.add(student1);
        studentList.add(student2);
        studentList.add(student3);
        studentList.add(student4);
        studentList.add(student5);
        Collections.sort(studentList, new Comparator<StudentQ5>() {
            @Override
            public int compare(StudentQ5 student1, StudentQ5 student2) {
                if(student2.score==student1.score){
                   int result= student2.name.compareTo(student1.name);
                    if(result<0)
                    {
                        return (int) student2.score;
                    }
                    else
                        return (int) student1.score;
                }
                else
                return (int) (student2.score - student1.score);
            }
        });
//        Collections.sort(studentList);
        Iterator<StudentQ5> iterator = studentList.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

    }
}
