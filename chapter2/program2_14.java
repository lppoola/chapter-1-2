/**
 * Laasya Poola
 * August 30, 2018
 * Program 2.14
 * This program creates a random phone number 
 */
import java.util.Random;
import java.text.DecimalFormat;

public class program2_14
{
    public static void main (String[] args)
    {
        Random generator = new Random();
        int num1, num2, num3, block1, block2;
        
        // create the area code (cannot have 8 or 9)
        num1 = generator.nextInt(7) + 1; // the first number cannot be 0
        num2 = generator.nextInt(8);
        num3 = generator.nextInt(8);
        
        // create first set (3 digits)
        block1 = generator.nextInt(743);
        DecimalFormat fmt = new DecimalFormat("###"); //make sure there are 3 digit
        
        // create second set (4 digits)
        block2 = generator.nextInt(9999);
        DecimalFormat fmt1 = new DecimalFormat("####"); //make sure there are 4 digit
        
        System.out.print(num1+num2+num3+ "-" + fmt.format(block1) + "-" + fmt1.format(block2));
        
    
    
    
       
    }

    
    
       
    }

