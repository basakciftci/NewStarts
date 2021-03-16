package AccessModifiers;

public class TableTest{
    public static void main(String[] args){
        Table table=new Table("Ikea","White","Wood");
        System.out.println(table.getBrand());
        table.setPrice(10);
        System.out.println(table.getPrice());
        table.setKind("Coffee Table");
        System.out.println(table.getKind());
        table.setAvailable(true);
        System.out.println(table.getIsAvailable());

    }
}
