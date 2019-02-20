public enum House {
    HOUSE1(600000),HOUSE2(1255000),HOUSE3(500000),HOUSE4(1500000),HOUSE5(1250000);
    public int price;
    House(int p) {
        price = p;
    }
    int getPrice() {
        return price;
    }
}
