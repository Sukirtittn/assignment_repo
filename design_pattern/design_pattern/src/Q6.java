interface PizzaToppings {
    String decorateWithToppings();
}

class Pizza implements PizzaToppings {
    String  size;
    String baseType;
    String sauce;

    public Pizza(String size, String base, String sauce) {
        this.size = size;
        this.baseType = base;
        this.sauce = sauce;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getBase() {
        return baseType;
    }

    public void setBase(String base) {
        this.baseType = base;
    }

    public String getSauce() {
        return sauce;
    }

    public void setSauce(String sauce) {
        this.sauce = sauce;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "size='" + size + '\'' +
                ", base='" + baseType + '\'' +
                ", sauce='" + sauce + '\'' +
                '}';
    }


    @Override
    public String decorateWithToppings() {
        return "This pizza is of size :: " + size + " base :: " + baseType + " and sauce used :: " + sauce;
    }
}

class CheeseToppings implements PizzaToppings{
    PizzaToppings toppings;
    String cheeseType;

    public CheeseToppings(PizzaToppings toppings, String cheeseType) {
        this.toppings = toppings;
        this.cheeseType = cheeseType;
    }

    public PizzaToppings getToppings() {
        return toppings;
    }

    public void setToppings(PizzaToppings toppings) {
        this.toppings = toppings;
    }

    public String getCheeseType() {
        return cheeseType;
    }

    public void setCheeseType(String cheeseType) {
        this.cheeseType = cheeseType;
    }

    @Override
    public String decorateWithToppings() {
        return toppings.decorateWithToppings()+" \n"+"topping with ::"+cheeseType;
    }
}

class OliveToppings implements PizzaToppings{
    PizzaToppings toppings;

    public OliveToppings(PizzaToppings toppings) {
        this.toppings = toppings;
    }

    @Override
    public String decorateWithToppings() {
        return toppings.decorateWithToppings()+"\n"+"Toppings with olive";
    }

}

class CapsicumToppings implements PizzaToppings {
    PizzaToppings toppings;

    public CapsicumToppings(PizzaToppings toppings) {
        this.toppings = toppings;
    }

    @Override
    public String decorateWithToppings() {
        return toppings.decorateWithToppings()+"\n"+"Toppings with Capsicum";
    }

}

class OnionToppings implements PizzaToppings{
    PizzaToppings toppings;

    public OnionToppings(PizzaToppings toppings) {
        this.toppings = toppings;
    }

    @Override
    public String decorateWithToppings() {
        return toppings.decorateWithToppings()+"\n"+" Toppings with onion";
    }
}

class Q6 {
    public static void main(String[] args) {
        Pizza pizza = new Pizza("Medium", "Pan", " schezwan");
        System.out.println( pizza.decorateWithToppings());
        CheeseToppings cheeseToppings=
                new CheeseToppings
                (new Pizza("Large","Pan","Red Chilly")
                        ,"mexican");
        System.out.println(cheeseToppings.decorateWithToppings());
        OliveToppings oliveToppings =
                new OliveToppings(new CheeseToppings
                        (new Pizza("small","cheese burst","mixed")
                                ,"cheddar"));
        System.out.println(oliveToppings.decorateWithToppings());
    }
}
