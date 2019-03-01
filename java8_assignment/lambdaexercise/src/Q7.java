interface inter1{
    default void display(){
        System.out.println("default method of interface1");
    }
    static void doSomething(){
        System.out.println("static method of interface1");
    }
}

public class Q7 implements inter1 {
    public void display(){
        System.out.println("overrided the default method");
    }

    public static void main(String[] args) {
        Q7 q= new Q7();
        q.display();
    }
}
