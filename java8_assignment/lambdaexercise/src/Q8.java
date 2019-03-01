interface inter{
    default void display(){
        System.out.println("default method of parent interface");
    }
    static void doSomething(){
        System.out.println("static method of parent interface");
    }
}
interface child1 extends inter {
    default void display(){
        System.out.println("default method of interface1");
    }
    static void doSomething(){
        System.out.println("static method of interface1");
    }
}
interface child2 extends inter{
    default void display(){
        System.out.println("default method of interface2");
    }
    static void doSomething(){
        System.out.println("static method of interface2");
    }
}

public class Q8 implements child1, child2 {
    public void display()
    {
        child1.super.display();
        child2.super.display();
        System.out.println("Class's own display method");
    }

    public static void main(String[] args) {
        Q8 q= new Q8();
        q.display();
    }

}
