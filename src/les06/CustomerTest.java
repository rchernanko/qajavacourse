public class CustomerTest {

    public static void main(String[] args) {
        
        Customer cust1, cust2, cust3;
        cust1 = new Customer();
        cust2 = new Customer();
        cust3 = new Customer();
          
        cust1.customerID = 1;
        cust2.customerID = 2;
        cust1.name = "Richard Chernanko";
        cust2.name = "James Keane";
        cust1.emailAddress = "richard email";
        cust2.emailAddress = "james email";
             
        cust1.displayCustomerInfo();
        cust2.displayCustomerInfo();     
        cust3.displayCustomerInfo();
    }
}
