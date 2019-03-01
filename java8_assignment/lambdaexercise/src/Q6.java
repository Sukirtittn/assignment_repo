interface java8{
    default void display(){
        System.out.println("default method of interface");
    }
    static void doSomething(){
        System.out.println("static method of interface");
    }
}
public class Q6 implements java8{
    public static void main(String[] args) {
        java8.doSomething();
       Q6 q=new Q6();
        q.display();
    }
}
