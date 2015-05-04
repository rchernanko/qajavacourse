public class Shirt 
    {
    //These are the fields or attributes for this class
    public int shirtID = 2;
    public String description = "I have changed this during debugging";
    //The colour codes are as follows (R = red, G = green and B = blue)
    public char colourCode = 'S';
    public double price = 4.2;
    public int quantityInStock = 3;
    //I am now going to write the methods for this class. A reminder that this class is called 'Shirt'
    public void displayInformation() 
    {
    System.out.println("Shirt ID: "+ shirtID);
    System.out.println("Shirt description: "+description);
    System.out.println("Shirt colour: "+colourCode);
    System.out.println("Shirt price: "+price);
    System.out.println("How many are in stock?: "+quantityInStock);            
}
}