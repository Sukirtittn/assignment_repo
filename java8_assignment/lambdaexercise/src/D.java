@FunctionalInterface
interface lambda3{
    String upperCase(String a);
}
public class D {
    public static void main(String[] args) {
        lambda3 lam3 = a -> {
            return (a.toUpperCase());
        };
        System.out.println(lam3.upperCase("sukirti"));
    }
}