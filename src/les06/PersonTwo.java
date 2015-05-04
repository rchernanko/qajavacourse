public class PersonTwo {
    public StringBuilder name = new StringBuilder(8);
    public StringBuilder phoneNumber = new StringBuilder();
    
public void displayPersonInfo() {
    name.append("Fernando");
    name.append(" ");
    name.append("Gonzales");
    System.out.println("Name: "+ name);
    System.out.println("Name object capacity: "+ name.capacity());
}
}
