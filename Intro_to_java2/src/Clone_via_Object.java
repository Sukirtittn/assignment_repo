public class Clone_via_Object implements Cloneable {
    int empId;
    String empName;
    int Age;

    public Clone_via_Object(int Id, String Name, int Age) {
        empId = Id;
        empName = Name;
        this.Age = Age;
    }
    public Object clone()throws CloneNotSupportedException{
        return super.clone();
    }
    public String toString() {
        return "Id: " + empId + ", Name: " + empName + ", Age:  " + Age;
    }

    public static void main(String[] args) {
        Clone_via_Object cloneObject1 = new Clone_via_Object( 1, "Sukirti", 22);
        System.out.println(cloneObject1);
        System.out.println("Cloning object:");
        try {
            Clone_via_Object cloneObject2 = (Clone_via_Object) cloneObject1.clone();
            System.out.println(cloneObject2);
        }
        catch (CloneNotSupportedException e)
        {
            System.out.println(e);
        }
    }
}