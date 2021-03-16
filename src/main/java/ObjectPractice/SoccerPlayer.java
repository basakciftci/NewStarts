package ObjectPractice;

public class SoccerPlayer{

    String name;
    int age;
    String position;
    String team;
    char gender;
    int totalDistance;

    public void run(){
        if (totalDistance>=3){
            System.out.println(name+" is running");
            totalDistance=totalDistance-3;
        }else if (totalDistance<3&&totalDistance>0){
            System.out.println(name+" is running slowly ");
        }else {
            System.out.println(name+" can not play in this game");
        }


    }public int shoot(){
        int speedShoot=30;
        System.out.println(name+" is shooting "+speedShoot+" speed");
        return speedShoot;
    }public void pass(){
        System.out.println(name+" is giving the pass");
    }


}
