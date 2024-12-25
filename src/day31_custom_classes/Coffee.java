package day31_custom_classes;

public class Coffee {

    double price;
    double sizeInOz;
    String brand;
    String type;


    public String toString() {
        String message = "Coffee " +
                "\n\tprice: $" + price +
                "\n\tsize In Oz: " + sizeInOz +
                "\n\tbrand: " + brand +
                "\n\ttype: " + type ;
        return message;
    }

    public void drink(){
        System.out.println("Drinking " + type + " type of coffee");
    }
    public void refill(double addOz){
        System.out.println("Refilling " + addOz + " oz");
        sizeInOz += addOz;
    }
}


