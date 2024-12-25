package day31_custom_classes;

public class Car {

    String model;
    int year;
    String color;
    double fuelLevel;

    public String toString() {
        return "Car Info: " +
                "\n\tmodel: " + model +
                "\n\tyear: " + year +
                "\n\tcolor: " + color  +
                "\n\tfuelLeve: " + fuelLevel;
    }
    public void drive () {
        System.out.println("Driving " + model);
        fuelLevel -=5;
    }
    public void fillTank() {
    System.out.println("filling tank");
    fuelLevel = 100;
     }
     public boolean isFuelLevelLow(){
        return fuelLevel < 25;
     }
}
