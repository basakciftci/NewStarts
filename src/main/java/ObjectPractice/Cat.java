package ObjectPractice;

public class Cat{
    String name;
    int age;
    String colour;
    boolean isRunning;
    String kind;
    int speed;
    public boolean start(){

        if (isRunning==false){
            isRunning=true;
        }
        speed=10;
        return isRunning;
    }
    public boolean stop(){

        isRunning=false;
        speed=0;
        return isRunning;
    }
    public void display(){
        System.out.println("Cat name is "+name+" cat age is "+age+ "Colour is "+colour+" Cat is running= "+isRunning+" Cat kind "+kind
        +" cat speed "+speed);
    }
    public void accelerate(int targetSpeed){
        if (speed<targetSpeed){
            int currentSpeed=speed;
            while(currentSpeed<=targetSpeed){
                System.out.println(currentSpeed);
                currentSpeed++;
            }speed=currentSpeed;
        }
    }
    public void run(){
        start();
        System.out.println(name+" is running");
    }public void run(String destination){
        start();
        System.out.println(name+" is running. Destination is "+destination);
    }public void run(String destination,int totalDistance){
        start();
        System.out.println(name+" is running. Destination is "+destination+ " total distance is "+totalDistance);
    }
    public void run(int ... num){
        System.out.println(num[0]);
        int lastIndex=num.length-1;
        System.out.println(lastIndex);
    }

    public static void main(String[] args){
        Cat cat=new Cat();
        cat.name="Puppy";
        cat.kind="Siyam";
        cat.colour="black";
        cat.speed=2;
        cat.age=5;
        //cat.isRunning=true;
        cat.display();
       cat.start();
        cat.display();
        cat.accelerate( 20 );
        System.out.println("======================");
        Cat cat1=new Cat();
        cat1.name="Princess";
        cat1.kind="scottish";
        cat1.colour="white";
        cat1.speed=0;
        cat1.age=3;
        cat1.run();
        cat1.display();
        cat1.run("Schamburg");
        cat1.run("Chicago",10);



    }

}
