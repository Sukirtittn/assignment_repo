public class Q7 {
    static String firstName;
    static String lastName;
    static int age;

    static {
        System.out.println("Static block 1 Initializing values");
        firstName = "Sukirti";
        lastName = "Kaushik";
        age = 23;
    }

    static {
        System.out.println("Static block 2 Display Values");
        System.out.println("FirstName :" + firstName);
        System.out.println("LastName :" + lastName);
        System.out.println("Age :" + age);

    }


    static void display() {
        age=25;
        System.out.println();
        System.out.println("Static function  Display Values");
        System.out.println("FirstName :" + firstName);
        System.out.println("LastName :" + lastName);
        System.out.println("Age :" + age);
    }


}
