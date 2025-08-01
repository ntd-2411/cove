package BUOI4_class_Bai3;

public class Car {
    String brand;
    int maxSpeed;

    public Car(String brand, int maxSpeed){
        this.brand = brand;
        this.maxSpeed = maxSpeed;
    }

    public void run(){
        System.out.print("xe " + brand + " dang chay voi toc do toi da " + maxSpeed + " km/h");
    }
}
