package WrapperClasses;

public class StaticVariables{
    public static void main(String[] args){
        Variables var1=new Variables( 5,6 );
        Variables var2=new Variables( 10,12 );
        System.out.println(var1.staticV);
        System.out.println(var2.staticV);
        var2.staticV=11;
        System.out.println(var1.staticV);
        System.out.println(var2.staticV);

        var1.variable1=var1.variable2+var1.staticV;
        var1.staticV=var2.variable2+var2.staticV;
        System.out.println(var1.staticV);
        System.out.println(var2.staticV);
        var2.variable1=var1.variable1+var2.staticV;
        System.out.println("================");
        System.out.println(var1.variable1);
        System.out.println(var1.staticV);
        System.out.println(var2.variable1);
        System.out.println(var2.staticV);


    }
}
