
/******************************************************************************************
 * File Name: PayCheck
 * @author (Abel Samuel) 
 * @version (02/08/2017)
 * Description of Class:  determine a pay check and
   display the net pay and its details on the screen.
 ******************************************************************************************
 */
package codeeval;
import java.util.*;

public class PayCheckDriver   {
   
    /**
     * This is the main method that will create an instance of PayCheck class
     * @param args Unused.
     * @return Nothing.
     */
   
    public static void main(String [] args)  {

    	String firstName = "";
    	String lastName;
           
        //String firstName;// Creating a scanner object.

        do 
        {
        	Scanner scanner = new Scanner(System.in);   
        	System.out.println("Please enter first name: ");  
         firstName = scanner.nextLine();
         
        if( firstName!=""); 
        {

        	System.out.println("Please enter last name: ");
         lastName = scanner.nextLine();
         System.out.println("Please enter your total hours worked: (enter only from 0 - 80) ");
         double hoursWorked = scanner.nextDouble();
         System.out.println("Please enter your hourly pay rate: (enter only from 5 - 100)");
         double hourlyRate = scanner.nextDouble();

         PayCheck payCheck = new PayCheck();                                // Creating an instance of PayCheck class
         payCheck.setFirstName(firstName);
         payCheck.setLastName(lastName);
         payCheck.setHoursWorked(hoursWorked);
         payCheck.setHourlyRate(hourlyRate);
         System.out.println(payCheck);
         firstName="";
         lastName="";
        } 
        }while(firstName.equals(""));
    }
        
        
        
        

    
}
