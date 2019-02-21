//class Q5{
//
//}
//
//public class Q5 {
//
//
//        this.id = original.id + 1;
//
//        this.name = new String(original.name);
//
//        this.city = new City(original.city);
//
//
//}
//
//
//class City implements Cloneable {
//
//    private final int id;
//
//    private String name;
//
//    public City clone() throws CloneNotSupportedException {
//
//        return (City) super.clone();
//
//    }
//
//}
//
//class Person implements Cloneable {
//
//    public Person clone() throws CloneNotSupportedException {
//
//        Person clonedObj = (Person) super.clone();
//
//        clonedObj.name = new String(this.name);
//
//        clonedObj.city = this.city.clone();
//
//        return clonedObj;
//
//    }
//
//}
