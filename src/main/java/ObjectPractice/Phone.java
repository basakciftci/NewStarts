package ObjectPractice;

public class Phone{
    String brandName;
    String personName;
    String passcode;
    String [] contactList=new String[10];
    String [] phoneNumbers=new String[10];
    boolean isLogin;

public boolean login(String passcode){

    if ( this.passcode.equals(  passcode)){
        System.out.println("Welcome "+brandName+ "!");
        isLogin=true;
        return isLogin;
    }return isLogin;
}
    public void displayContact(){
        for (int i=0;i<contactList.length;i++){
            System.out.println(contactList[i]+"==>"+phoneNumbers[i]);
        }
    }public boolean addNewContact(String name,String phoneNumber){
        boolean isAdded=false;
        for (int i=0;i<contactList.length;i++)
            if (contactList[i]==null) {
                contactList[i]=name;
                phoneNumbers[i]=phoneNumber;
                isAdded=true;
                break;
            }return isAdded;

    }public void updateName(String oldName, String newName){
        for (int i=0;i<contactList.length;i++){
            if (contactList[i].equals( oldName )){
                contactList[i]=newName;
                break;
            }
        }

    }
    public void updateNum(String oldPhone,String newPhone){
        for (int i=0;i<phoneNumbers.length;i++){
            if (phoneNumbers[i].equals( oldPhone)){
                phoneNumbers[i]=newPhone;
                break;
            }
        }

    }public boolean remove(String personName){
        for (int i=0;i<contactList.length;i++){
            if (contactList[i].equals( personName )){
                contactList[i]=null;
                phoneNumbers[i]=null;
                return true;
            }
        }
      return false;
    }
    public String searchPhone(String phoneNumber){
        for (int i=0;i<phoneNumbers.length;i++){
            if (phoneNumbers[i].equals( phoneNumber )){
                return contactList[i];
            }
        }
        return null;
    }
    public String serchName(String name){
        for (int i=0;i<contactList.length;i++){
            if (contactList[i].equals( name )){
               return phoneNumbers[i];
            }
        }
        return null;
    }
    public void getInstruction(){
        System.out.println("To be able to login please press 1");
        System.out.println("To be able to print list of contact press 2");
        System.out.println("To be able to add new contact press 3");
        System.out.println(" to be able to update contact name press 4");
        System.out.println("To be able to add new contact press 5");
        System.out.println("To be able to remove contact press 6");
        System.out.println("To be able to search with number press 7");
        System.out.println("To be able to search with name press 8");
        System.out.println("To be able to exit press 9");





    }

}
