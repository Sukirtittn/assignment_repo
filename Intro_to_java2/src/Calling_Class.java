abstract class Furniture {
    String material;
    int weight;
    public Furniture(String material, int weight) {
        this.material = material;
        this.weight = weight;
    }
    abstract void stressTest(String material, int weight);
    abstract void fireTest(String material);
}
class Chair extends Furniture {
    String shape;
    Chair(String material, int weight, String shape) {
        super(material, weight);
        this.shape = shape;
    }
    void stressTest(String material, int weight) {
        int stress = 12;
        if (material == "wooden") {
            if (weight < stress) {
                System.out.println("Material=wooden: stress test failed");
            } else {
                System.out.println("Material=wooden: stress test passed");
            }
        } else if (material == "metal") {
            System.out.println("Material=metal: stress test passed");
        }
    }
    void fireTest(String material) {
        if (material == "wooden") {
            System.out.println("Material=wooden: Test Failed");
        } else if (material == "metal") {
            System.out.println("Material=metal: Test Passed");
        }
    }
}
class Table extends Furniture {
    String shape;
    int height;
    Table(String material, int weight, String shape, int height) {
        super(material, weight);
        this.shape = shape;
        this.height = height;
    }
    void stressTest(String material, int weight) {
        int stress = 25;
        if (material == "wooden") {
            if (weight < stress) {
                System.out.println("Material=wooden: Test Failed");
            } else {
                System.out.println("Material=wooden: Test Passed");
            }
        } else if (material == "metal") {
            System.out.println("Material=metal: Test passed");
        }
    }
    void fireTest(String material) {
        if (material == "wooden") {
            System.out.println("Material=wooden: test fail :chair burnt");
        } else if (material == "metal") {
            System.out.println("Material=metal: test pass!");
        }
    }
}
public class Calling_Class {
    public static void main(String[] args) {
        Chair c1 = new Chair("wooden", 5, "circular");
        Chair c2 = new Chair("metal", 7, "square");
        c1.stressTest(c1.material, c1.weight);
        c1.fireTest(c1.material);
        c2.stressTest(c2.material, c2.weight);
        c2.fireTest(c2.material);
        Table t1 = new Table("wooden", 7,"oval", 3);
        t1.stressTest(t1.material, t1.weight);
        t1.fireTest(t1.material);
        Table t2 = new Table("metal", 10, "rectangular", 4);
        t2.stressTest(t2.material, t2.weight);
        t2.fireTest(t2.material);
    }
    }
