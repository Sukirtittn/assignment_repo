public class Clone_via_CopyConstructor {
    int empId;
    String empName;
    int Age;
    public Clone_via_CopyConstructor(int Id, String Name, int Age) {
        empId = Id;
        empName = Name;
        this.Age = Age;
    }
    public Clone_via_CopyConstructor(Clone_via_CopyConstructor c) {
        this.empId = c.empId;
        this.empName = c.empName;
        this.Age = c.Age;

    }
    public String toString() {
        return "Id: " + empId + ", Name: " + empName + ", Age:  " + Age;
    }
    public static void main(String[] args) {
        Clone_via_CopyConstructor copyConstructor1 = new Clone_via_CopyConstructor(1, "Sukirti", 22);
        System.out.println(copyConstructor1.toString());
        Clone_via_CopyConstructor copyConstructor2 = new Clone_via_CopyConstructor(copyConstructor1);
        System.out.println(copyConstructor2);
    }
}

