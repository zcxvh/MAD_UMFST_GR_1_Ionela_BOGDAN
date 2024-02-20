public class Sedan extends Car{
    int length;

    // Constructor
    public Sedan(int speed, double regularPrice, String color, int length) {
        super(speed, regularPrice, color);
        this.length = length;
    }


    @Override
    public double getSalePrice() {
        if (length > 20) {
            return super.getSalePrice() * 0.95; // 5% discount
        } else {
            return super.getSalePrice() * 0.9; // 10% discount
        }
    }

}
