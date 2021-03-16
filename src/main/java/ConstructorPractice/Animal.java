package ConstructorPractice;

public class Animal{
    String name;
    String location;
    public  Animal(String name, String location){
        this.name=name;
        this.location=location;
    }
    public static void main(String[] args){
        Animal animal=new Animal("Pars","Usa");
        System.out.println(animal.name);
        System.out.println(animal.location);
    }
}
