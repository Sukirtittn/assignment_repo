@FunctionalInterface
interface Lambda5 {
    int dosomething1(int a, int b);
}
public class Q3 {
    int add(int a, int b) {
        return a + b;
    }
    int subtract(int a, int b) {
        return a - b;
    }
    static int multiply(int a, int b) {
        return a * b;
    }
    public static void main(String[] args) {
        Lambda5 lam1 = new Q3()::add;
        System.out.println(lam1.dosomething1(5, 6));
        Lambda5 lam2 = new Q3()::subtract;
        System.out.println(lam2.dosomething1(5, 6));
        Lambda5 lam3 = Q3::multiply;
        System.out.println(lam3.dosomething1(5, 6));
    }
}
