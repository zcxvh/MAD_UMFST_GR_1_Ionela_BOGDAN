public class Car {
    int speed;
    double regularPrice;
    String color;

    //CONSTRUCTOR
    public Car(int speed,double regularPrice,String color){
        this.speed = speed;
        this.regularPrice = regularPrice;
        this.color = color;
    }

    double getSalePrice() {
        return regularPrice;
    }
}
