@FunctionalInterface
interface lambda6 {
    Employee createEmp(String n, Integer a, String c);
}
class Employee {
    String name;
    Integer age;
    String city;
    public Employee(String name, Integer age, String city) {
        this.name = name;
        this.age = age;
        this.city = city;
    }
    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", city='" + city + '\'' +
                '}';
    }
}
public class Q4 {
    public static void main(String[] args) {
        lambda6 lam6 = Employee::new;
        Employee employee = lam6.createEmp("Sukirti", 23, "Delhi");
        System.out.println(employee);
    }
}
