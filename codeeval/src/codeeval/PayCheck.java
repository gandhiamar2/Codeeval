
/******************************************************************************************
 * File Name: PayCheck
 * @author (Abel Samuel) 
 * @version (02/08/2017)
 * Description of Class:  determine a pay check and
   display the net pay and its details on the screen.
 ******************************************************************************************
 */
package codeeval;
public class PayCheck
{

    /*
     * the fields below are referenced.
     * 
     */
    double hourlyRate, hoursWorked, grossPay, netPay, federalTaxAmount, stateTaxAmount, FICAAmount;
    String lastName, firstName;
    final double FEDERAL_TAX_RATE = 0.15;
    final double STATE_TAX_RATE = 0.09;
    final double FICA_RATE = 0.07;

    public PayCheck () {
        /*
         * the fields below are initialized to '0' for double datatype and 'unknown' for string datatype.
         */
        double hourlyRate = 0;
        double hoursWorked = 0;
        double grossPay = 0;
        double netPay = 0;
        double federalTaxAmount = 0;
        double stateTaxAmount = 0;
        double FICAAmount = 0;
        String lastName = "unknown";
        String firstName = "unknown";

    }

    public void setHourlyRate(double hourlyRate)  {
        this.hourlyRate = hourlyRate;
    }

    public double getHourlyRate()  {
        return this.hourlyRate;
    }

    public void setHoursWorked(double hoursWorked)  {
        this.hoursWorked = hoursWorked;
    }

    public double getHoursWorked()  {
        return this.hoursWorked;
    }

    public void setFirstName(String firstName)  {
        this.firstName = firstName;
    }

    public String getFirstName()  {
        return this.firstName;
    }

    public void setLastName(String lastName)  {
        this.lastName = lastName;
    }

    public String getLasttName()  {
        return this.lastName;
    }

    public double getGrossPay()   {
        return this.grossPay;
    }

    public double getNetPay()   {
        return this.netPay;
    }

    public double getFederalTaxAmount()   {
        return this.federalTaxAmount;
    }

    public double getStateTaxAmount()   {
        return this.stateTaxAmount;
    }

    public double getFICAAmount()   {
        return this.FICAAmount;
    }

    public String toString() {
        /*
         * This is the toString method that returns a textual representation of the state of the
           object. This method will be called in the Driver class from a print( )
           statement. 
         */
        System.out.println("******************************************************************");
        System.out.println("                  ******  Tax Calculation *******");
        System.out.println("Name : " + this.firstName + " " + this.lastName);
        System.out.println("Gross Pay: " + this.grossPay);
        System.out.println("Federal Tax: " + this.federalTaxAmount);
        System.out.println("State Tax: " + this.stateTaxAmount);
        System.out.println("FICA Amount: " + this.FICAAmount);
        System.out.println("******************************************************************");
        return "";

    }
}
