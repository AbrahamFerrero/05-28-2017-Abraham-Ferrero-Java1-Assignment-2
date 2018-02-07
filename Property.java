
/**
 *
 * @author (Abraham Ferrero)
 * @version (24/05)
 */
public class Property
{
   private int id;
   private String address;
   private boolean sold;
   private int askingPrice;
   private int soldPrice;
   
   public Property (int inId, String inAddress, int inPrice)
   {
      id = inId;
      address = inAddress;
      askingPrice = inPrice;
   }
 
   Property(int inId, String inAddress)
   {
      id = inId;
      address = inAddress;
   }
   
   public int getId()
   {
       return id;
   }
   
   public String getAddress()
   {
       return address;
   }
   
   public boolean isSold()
   {
       return sold;
   }
   
   int getAskingPrice()
   {
       return askingPrice; 
   }
   
   int getSoldPrice()
   {
      return soldPrice;
   }
   
  public void printdetails()
  {
    System.out.print(id + " " + address + " at $" + askingPrice + "\n");
  }
  
  public void setAskingPrice(int inAskingPrice)
  {
      askingPrice = inAskingPrice;
  }
  
  void sell(int inSoldPrice)
  {
      sold = true;
      soldPrice = inSoldPrice;
  }

}
