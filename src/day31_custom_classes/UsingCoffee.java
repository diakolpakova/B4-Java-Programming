package day31_custom_classes;

public class UsingCoffee {
    public static void main(String[] args) {
        Coffee coffee1 = new Coffee();

        System.out.println(coffee1);
        coffee1.price = 7.99;
        coffee1.sizeInOz = 16.00 ;
        coffee1.brand = "Starbacks";
        coffee1.type = "Black";
        System.out.println(coffee1);

        System.out.println();
        coffee1.drink();
        System.out.println();
        coffee1.refill(2.0);
        System.out.println(coffee1.sizeInOz);

        System.out.println("------------");

        Coffee coffee2 = new Coffee();
        System.out.println(coffee2);
        System.out.println();
        coffee2.drink();

        coffee2.refill(10);
        System.out.println(coffee2);

    }
}
