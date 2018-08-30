/**
 * Laasya Poola
 * August 30, 2018
 * Program Name
 * This program displays the user's name using string methods
 */
import java.util.Scanner;


public class name
{
    public static void main (String[] args)
    {
        Scanner scan = new Scanner(System.in);
        String name;
        
        // get name input from user
        System.out.println("Enter your first, middle, and last name with spaces between each name: ");
        name = scan.nextLine();
        
        // find positon of first space
        int space1 =name.indexOf (" ");
        
        // print first name and middle initial
        System.out.println(name.substring(0,(space1+2)) + ".");
        
        // create new variable for the remaining name
        String name2 = name.substring(space1+1);
        
        // find position of space in remaining name (second space in full name)
        int space2 =name2.indexOf(" ");
        
        // print last name
        System.out.println(name2.substring(space2+1));
        

        
        
        
        
    
    
    
       
    }

    
    
       
    }

