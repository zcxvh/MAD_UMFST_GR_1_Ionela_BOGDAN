public class Truck extends Car{
    int weight;

    public Truck(int speed, double regularPrice, String color, int weight) {
        super(speed, regularPrice, color);
        this.weight = weight;
    }

    double getSalePrice(){
        if(weight>200){
           return regularPrice=regularPrice-(10/100)*regularPrice;
        }
        else {
            return regularPrice=regularPrice-(20/100)*regularPrice;
        }

    }
}
