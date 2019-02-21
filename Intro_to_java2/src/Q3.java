public class Q3 {
    public static void main(String[] args) {
//        try
//        {
//            Class.forName("abcd");
//        }catch (ClassNotFoundException e)
//        {
//            e.printStackTrace();
//        }
        try{
            Library_mgmt l=new Library_mgmt();
        }catch (NoClassDefFoundError e){
            e.printStackTrace();
        }
    }
}
