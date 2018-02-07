

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class TestRealEstateCompany.
 *
 * @author  (Abraham Ferrero CIT215389)
 * @version (24/05)
 */
public class TestRealEstateCompany
{
   public static void main (String[] args)
    {
        RealEstateCompany re = new RealEstateCompany( "Abraham Ferrero Realty"); //Change to your name
        Property p1 = new Property(1, "1 Cheap St", 1000);
        Property p2 = new Property(22, "2 Expensive Place", 2222222);
        Property p3 = new Property(33, "3 Average St"); //use constructor that sets price to zero
        p3.setAskingPrice(330000);        //set the asking price now
        Property p4 = new Property(44, "4 Average St", 340000);
        Property p5 = new Property(555, "5 Average St", 350000);        
        re.addProperty (p1);
        re.addProperty (p2);
        re.addProperty (p3);
        re.addProperty (p4);
        re.addProperty (p5);
        // properties 44 & 22 sell, number 22 at a reduced price
        re.sellProperty(44, 340000);
        re.sellProperty(22, 2222000);
        
        re.printAllPropertiesForsale(); //print a list of all properties for sale
        re.printAllPropertiesSold(); //print a list of all properties sold

        re.printExpensivePropertiesForSale(300000); //print properties for sale worth more than $300000
        re.sellProperty(5, 2000); //produces id error
        re.sellProperty(44, 1000); //produces already sold error
  }
}

