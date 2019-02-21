public class Q6 {
    public static void main(String[] args) {
        try{
            int i=0;
            int j=10;
            int divide=j/i;
            System.out.println("result of divide is "+divide);
            System.out.println("this will be skipped");
        }catch (Exception e){
            e.printStackTrace();
        }
        finally {
            System.out.println("this block will be definitely executed ");
        }

        System.out.println("this should also be executed!");
    }
}
