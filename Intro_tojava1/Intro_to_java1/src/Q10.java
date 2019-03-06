public class Q10 {
    public void add(int a, int b) {
        int add_result = a + b;
        System.out.println("Sum of two interger a: " + a + " b: " + b + " is: " + add_result);
    }

    public void add(double a, double b) {
        double add_result = a + b;
        System.out.println("Sum of two double a: " + a + " b: " + b + " is: " + add_result);
    }

    public void multiply(int a, int b) {
        int mul_result = a * b;
        System.out.println("Multiplication of two interger a: " + a + " b: " + b + " is: " + mul_result);
    }

    public void multiply(float a, float b) {
        float mul_result = a * b;
        System.out.println("Multiplication of two float a: " + a + " b: " + b + " is: " + mul_result);

    }

    public void concat(String a, String b) {
        String output = a.concat(b);
        System.out.println("After concatenation of two strings a: " + a + " and b: " + b + " output is " + output);
    }

    public void concat(String a, String b, String c) {
        String output = a.concat(b + c);

        System.out.println("After concatenation of three strings a: " + a + " ,b: " + b + " and c: " + c + " output is " + output);
    }

    public void call_Q10() {
        add(5, 6);
        add(2.432, 4.086);
        multiply(13, 78);
        multiply(3.14f, 9.81f);
        concat("sukirti", "kaushik");
        concat("sukirti", "kaushik", "sharma");
    }
}

