public class Customer {
    public int customerID = 0;//This is the CustomerID and is an integer type.
    public char status = 'O';//This is the status of the Customer, Old or New, and is a character type.
    public double totalPurchases = 0.0;//This is the total amount of purchases the customer has made and is a double type.
    public String random = "love the view of the docks";
    
public void displayCustomerInfo() {
    System.out.println("Customer ID: "+ customerID);//This will print out the value within the customerID field.
    System.out.println("Customer Status: "+ status);//This will print out the value within the status field.
    System.out.println("Total Purchases: "+ totalPurchases);//This will print out the value within the totalPurchases field.
    System.out.println("the following is a random sentence: "+ random);
}
}
