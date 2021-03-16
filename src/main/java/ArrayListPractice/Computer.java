package ArrayListPractice;

public class Computer{
    String brand;
    int year;
    String model;
    int memory;
    double screenSize;
    boolean hasCamera;
    double price;

    public Computer(String brand,int year, String model){
        this.brand=brand;
        this.year=year;
        this.model=model;

    }

    public Computer(String brand, int year, String model, int memory, double screenSize, boolean hasCamera, double price){
        this.brand=brand;
        this.year=year;
        this.model=model;
        this.memory=memory;
        this.screenSize=screenSize;
        this.hasCamera=hasCamera;
        this.price=price;
    }

    public Computer(String brand, int year, double price){
        this.brand=brand;
        this.year=year;
        this.price=price;
    }
}
