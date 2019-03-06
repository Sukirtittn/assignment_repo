@FunctionalInterface
interface lambda{
    boolean firstNogreater(int a, int b);
}

public class A {
    public static void main(String[] args) {
        lambda lam=((a, b)-> a >= b && a != b);
        System.out.println(lam.firstNogreater(5,6));
    }
}
