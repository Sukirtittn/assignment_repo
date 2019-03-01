@FunctionalInterface
interface lambda1{
    int increment(int a);
}
public class B {
    public static void main(String[] args) {
        lambda1 lam1 = a -> {
            a++;
            return a;
        };
        System.out.println(lam1.increment(5));
    }
}
