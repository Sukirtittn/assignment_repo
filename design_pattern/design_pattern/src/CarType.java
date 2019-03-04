enum CarType {
    MICRO, MINI, LUXURY;
}

enum Country {
    JAPAN, USA, INDIA;
}

abstract class Car {

    CarType carType;

    Country location;

    public Car(CarType carType, Country location) {
        this.carType = carType;
        this.location = location;
    }

    abstract void construct();

    @Override
    public String toString() {
        return "Car{" +
                "carType=" + carType +
                ", location=" + location +
                '}';
    }
}
class LuxuryCar extends Car {

    public LuxuryCar(Country location) {
        super(CarType.LUXURY, location);
    }

    @Override
    void construct() {
        System.out.println("connecting to Luxury Car");
    }
}

class MiniCar extends Car {

    public MiniCar(Country location) {
        super(CarType.MINI, location);
    }

    @Override
    void construct() {
        System.out.println("connecting to Mini Car");
    }
}

class MicroCar extends Car {

    public MicroCar(Country location) {
        super(CarType.MINI, location);
    }

    @Override
    void construct() {
        System.out.println("connecting to Micro Car");
    }
}
class IndianCarFactory {
    static Car buildCar(CarType carType) {
        Car car = null;
        switch (carType) {
            case MICRO:
                car = new MicroCar(Country.INDIA);
                break;
            case MINI:
                car = new MiniCar(Country.INDIA);
                break;
            case LUXURY:
                car = new LuxuryCar(Country.INDIA);
                break;
        }
        return car;
    }
}
class JapanCarFactory {
    static Car buildCar(CarType carType) {
        Car car = null;
        switch (carType) {
            case MICRO:
                car = new MicroCar(Country.JAPAN);
                break;
            case MINI:
                car = new MiniCar(Country.JAPAN);
                break;
            case LUXURY:
                car = new LuxuryCar(Country.JAPAN);
                break;
        }
        return car;
    }
}
class USACarFactory {
    static Car buildCar(CarType carType) {
        Car car = null;
        switch (carType) {
            case MICRO:
                car = new MicroCar(Country.USA);
                break;
            case MINI:
                car = new MiniCar(Country.USA);
                break;
            case LUXURY:
                car = new LuxuryCar(Country.USA);
                break;
        }
        return car;
    }
}
class CarFactory {
    Car car = null;

    static Car buildCar(CarType carType, Country location) {
        Car car = null;
        switch (location) {
            case INDIA:
                car = IndianCarFactory.buildCar(carType);
                break;
            case USA:
                car = USACarFactory.buildCar(carType);
                break;
            case JAPAN:
                car = JapanCarFactory.buildCar(carType);
                break;
        }
        return car;
    }
}
class AbstractFactory {
    public static void main(String[] args) {
        System.out.println(
                CarFactory.buildCar(CarType.MICRO, Country.JAPAN)
        );
        System.out.println(
                CarFactory.buildCar(CarType.LUXURY, Country.INDIA)
        );  System.out.println(
                CarFactory.buildCar(CarType.MINI, Country.USA)
        );
    }
}
