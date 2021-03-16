package ObjectPractice;

public class SoccerTest{
    public static void main(String[] args){
        SoccerPlayer player=new SoccerPlayer();
        player.name="Messi";
        player.age=35;
        player.gender='M';
        player.position="Forward";
        player.team="Manchester Un.";

        player.totalDistance=8;
        player.run();
        player.pass();
        player.shoot();
        System.out.println("Player name "+player.name+" Age "+player.age+ " gender "+player.gender+
                " position "+player.position +" team "+player.team);

        int speed=player.shoot();
        System.out.println("player shooting "+(speed*2));
        int shootDistance=25;
        if (speed >= 20 && shootDistance < 30) {

            System.out.println("It is goal");
        }else {
            System.out.println("It is not goal");
        }
        SoccerPlayer player1=new SoccerPlayer();
        player1.name="Ronaldo";
        player1.totalDistance=6;
        player.run();
        player1.run();
        player1.run();
        player1.shoot();
        player1.pass();
        player.run();
        System.out.println(player1.totalDistance);
        System.out.println(player.totalDistance);

    }
}
