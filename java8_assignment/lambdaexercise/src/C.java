@FunctionalInterface
interface lambda2{
    String concatstr(String a, String b);
}
public class C {
    public static void main(String[] args) {
        lambda2 lam2 =(a,b)-> a+b;
        System.out.println(lam2.concatstr("sukirti","kaushik"));
    }
}
