public class Order {
    
    public long orderValue = 10L;
    public int itemQuantity = 100_000;
    public int itemPrice = 3_444_444;
    
    public void calculateTotal () {
        orderValue = (long) itemQuantity * itemPrice;
        System.out.println ("The total order value is " +orderValue);    
    }
}
