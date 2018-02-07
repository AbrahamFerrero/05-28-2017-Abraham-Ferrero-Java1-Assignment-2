
/**
 * Write a description of class RealEstateCompany here.
 *
 * @author (Abraham Ferrero)
 * @version (24/05)
 */
public class RealEstateCompany
{
    private String name; //?
    private int numProperties = 0;
    private final int MAX_PROPERTIES = 10;
    private Property[] properties = new Property[MAX_PROPERTIES];
 
    public RealEstateCompany(String inName)
    {
        inName = name;
    }
 
    public void addProperty(Property inProperty)
    {
        if (numProperties < MAX_PROPERTIES)
        {
            properties[numProperties] = inProperty;
            numProperties++;
        }
        else
        {
            System.out.println("Error - Limit of properties reached");
        }
     
    }
 
    public void printAllPropertiesForsale()
    {
        System.out.println ("*** Listing of all properties for sale");  
        for (int i=0; i<numProperties; i++)
        {
            if (properties[i].isSold() == false)
            {
                properties[i].printdetails();
            }
        }
        System.out.println("*** End of properties for sale listing");
    }

    public void printAllPropertiesSold()
    {
        System.out.println ("*** Listing of all properties sold"); 
        int totalSold = 0;
        for (int i=0; i<numProperties; i++)
        {
            if (properties[i].isSold() == true)
            {
                 properties[i].printdetails();
                 totalSold += properties[i].getSoldPrice();
            } 
        }
        System.out.println("*** Total price of all sales is $" + totalSold);
    }
 
    public void sellProperty(int inId, int inSoldPrice)
    {
        boolean propertyFound = false;
        for (int i=0; i<numProperties; i++)
        {
            if (properties[i].getId()== inId)
            {
                propertyFound = true;
                if (properties[i].isSold())
                {
                     System.out.println ("Error – Property with id " + inId + " is already sold"); 
                }
                else
                {
                     properties[i].sell(inSoldPrice);
                }   
            } 
        }
        if (!propertyFound)
        {
           System.out.println ("Error: No property with id of " + inId + " to sell");
        }
    }
        
    public void printExpensivePropertiesForSale(double threshhold)
    {
        System.out.println ("*** Listing of properties for sale >=$" + threshhold);
        for (int i=0; i<numProperties; i++)
        {
            if (properties[i].getAskingPrice() >= threshhold & properties[i].isSold() == false)
            {
                properties[i].printdetails();
            } 
        }
         System.out.println ("*** End of properties for sale >= $" + threshhold + " listing");
    }
 }