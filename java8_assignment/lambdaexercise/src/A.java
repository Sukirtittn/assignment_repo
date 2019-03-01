@FunctionalInterface
interface lambda{
    boolean firstNogreater(int a, int b);
}

public class A {
    public static void main(String[] args) {
        lambda lam=((a, b)->{
            if(a < b || a==b){
            return false; }
        else
        return true;
        });
        System.out.println(lam.firstNogreater(5,6));
    }
}
