package ForLoop;

public class StaticCompare{
    public static void main(String[] args){


        String[][] names1={{"Adam", "John"}, {"Kushal", "Priyanka", "Sameer"}, {"Lee", "Mao"}};

        OptionalLAbel.arrayM(names1);
        OptionalLAbel lb=new OptionalLAbel();
        lb.arrayM(names1);
        lb.printM();
        int [] cress []= new int [10][20];
        for (int i=0;i<cress.length;i++){
            for (int j=0;j<cress.length;j++){
                cress[i][j]='x';
            }
            System.out.println(cress.length);
        }

    }
}