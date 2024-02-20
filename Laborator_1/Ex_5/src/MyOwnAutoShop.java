public class MyOwnAutoShop {
    public static void main(String[] args) {
        // Create an instance of Sedan class
        Sedan sedan = new Sedan(120, 20000, "Red", 25);
        System.out.println("Sale price of Sedan: $" + sedan.getSalePrice());

        // Create two instances of Ford class
        Ford ford1 = new Ford(140, 25000, "Blue", 2018, 2000);
        System.out.println("Sale price of Ford 1: $" + ford1.getSalePrice());

        Ford ford2 = new Ford(150, 30000, "Black", 2019, 2500);
        System.out.println("Sale price of Ford 2: $" + ford2.getSalePrice());

        // Create an instance of Car class
        Car car = new Car(100, 15000, "White");
        System.out.println("Sale price of Car: $" + car.getSalePrice());
    }
}
