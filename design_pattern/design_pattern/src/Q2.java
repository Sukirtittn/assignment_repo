interface Polygon{
    void getPolygontype();
}
class Polygon1 implements Polygon{
    @Override
    public void getPolygontype() {
        System.out.println("Polygon type 1");
    }
}
class Polygon2 implements Polygon{
    @Override
    public void getPolygontype() {
        System.out.println("Polygon type 2");
    }
}
class Polygon3 implements Polygon{
    @Override
    public void getPolygontype() {
        System.out.println("Polygon type 3");
    }
}
class Polygondesign{
    Polygon polygon;
    public Polygon preparedesign(){
        return polygon;
    }
    public void setPolygon(Polygon polygon){
        this.polygon=polygon;
    }
}
class PolygonFactory {
    static Polygondesign geyPolygonObject(String name){
        Polygondesign polygondesign=new Polygondesign();
        switch (name){
            case "polygon1":
                polygondesign.setPolygon(new Polygon1());
                break;
            case "polygon2":
                polygondesign.setPolygon(new Polygon2());
                break;
            case "polygon3":
                polygondesign.setPolygon(new Polygon3());
                break;
        }
        return polygondesign;
    }
}

public class Q2 {

    public static void main(String[] args) {
        Polygondesign polygondesign1=PolygonFactory.geyPolygonObject("polygon1");
        polygondesign1.preparedesign().getPolygontype();
        Polygondesign polygondesign2=PolygonFactory.geyPolygonObject("polygon2");
        polygondesign2.preparedesign().getPolygontype();
        Polygondesign polygondesign3=PolygonFactory.geyPolygonObject("polygon3");
        polygondesign3.preparedesign().getPolygontype();
    }
}
