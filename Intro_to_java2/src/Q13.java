public class Q13 {
    int id;
    String Name;
    int age;
    Q13(int id, String name, int a) throws AgeLessThan18Exception {
        this.id = id;
        this.Name = name;
        if (a < 18) throw new AgeLessThan18Exception("Less than 18");
        else {
            this.age = a;
        }
    }
    public void setAge(int a) throws AgeLessThan18Exception {
        if (a < 18) throw new AgeLessThan18Exception("Less than 18");
        else {
            this.age = a;
            System.out.println("Age is set to " + a);
        }
    }
}

class AgeLessThan18Exception extends Exception {
    AgeLessThan18Exception(String excep) {
        super(excep);
    }

    @Override
    public void printStackTrace() {
        System.out.println("No stack trace msg");
    }
}

class MainCaller {
    public static void main(String[] args) {
        try {
            Q13 q1=new Q13(2,"sukirti",19);
            q1.setAge(12);
           // Q13 q=new Q13(1,"sukirti",13);

        }catch (Exception e)
        {
            System.out.println(e);
            e.printStackTrace();
        }
    }
}