public class SingletonExample {
    static SingletonExample singletonExample;
    String A;
    int B;
    private SingletonExample(String A,int B){
        this.A=A;
        this.B=B;
    }
    public static SingletonExample getInstance(String A,int B){
        if(singletonExample==null){
           singletonExample= new SingletonExample(A,B);
        }
        return singletonExample;
    }
    @Override
    public String toString() {
        return "SingletonExample{" +
                "A='" + A + '\'' +
                ", B=" + B +
                '}';
    }
}
class Main{
    public static void main(String[] args) {
        System.out.println(SingletonExample.getInstance("sukirti",22));
        System.out.println(SingletonExample.getInstance("sukirti1",21));
    }
}