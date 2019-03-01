@FunctionalInterface
interface Lambda4{
    Integer dosomething(Integer a, Integer b);
}
public class Q2 {
    public static void main(String[] args) {
        Lambda4 lambda4=(a,b)->a*b;
        System.out.println("method will be used for multiply "+lambda4.dosomething(5,6));
    }
}
