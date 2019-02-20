public class Q9 {
    public void dis(){
        System.out.println("Display values of enums using a constructor & getPrice()");
        for (House h : House.values()) {
            System.out.println(h + " costs $" + h.getPrice());
        }

    }
}