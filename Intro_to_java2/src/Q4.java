public class Q4 {
        private static Q4 singletonClass=null;
        String msg;
        private Q4()
        {
            msg = "we are creating singleton class";
        }
        static Q4 createSingletonClass()
        {
            if(singletonClass==null)
                singletonClass=new Q4();
            return singletonClass;
        }
        public static void main(String[] args) {
            Q4 s1= Q4.createSingletonClass();
            Q4 s2= Q4.createSingletonClass();
            System.out.println(s1);
            System.out.println(s2);
            s1.msg= (s1.msg).toUpperCase();
            System.out.println(s1.msg);
            System.out.println(s2.msg);
        }
    }
