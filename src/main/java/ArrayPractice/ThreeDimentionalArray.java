package ArrayPractice;

public class ThreeDimentionalArray{
    public static void main(String[] args){
        String [][][] roomNum=new String [1][2][3];
        roomNum[0][0][0]="room1";roomNum[0][0][1]="room2";roomNum[0][0][2]="room3";
        roomNum[0][1][0]="room11";roomNum[0][1][1]="room12";roomNum[0][1][2]="room13";
        //roomNum[0][2][0]="room1";roomNum[0][2][1]="room2";roomNum[0][2][2]="room3";
        for (int i=0;i<roomNum.length;i++){
            for (int k=0;k<roomNum[i].length;k++){
                for (int j=0;j<roomNum[i][k].length;j++){
                    System.out.println(roomNum[i][k][j]);
                }
            }
        }

    }
}
