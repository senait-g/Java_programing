package day05_operators;

public class SalaryCalculator {

    public static void main(String[] args) {


    double hourlyRate = 55;
    double weeklyHour = 45;
    double stateTaxRate = 7; // implicit casting
    double federalTaxRate = 24.5;
//-------------------------------------------------------------------


        double SalaryBeforeTax  = hourlyRate * weeklyHour * 52;

        double stateTax = SalaryBeforeTax  * stateTaxRate / 100;

       double federalTax = SalaryBeforeTax *  federalTaxRate / 100;

       double totalTax = stateTax + federalTax;

       double salaryAfterTax = SalaryBeforeTax - totalTax;


        System.out.println("Gross pay is: $" + SalaryBeforeTax);
        System.out.println("Federal tax is: $" + federalTax );
        System.out.println("State tax is: $" + stateTax);
        System.out.println("Total tax is: $" + totalTax);
        System.out.println("Net income is: $" + salaryAfterTax);

        System.out.println("--------------------------------------------------");

        System.out.println("Gross pay is: $" + SalaryBeforeTax +
                "\n Federal tax is: $" + federalTax + "\nState tax is: $" + stateTax
        + "\nTotal tax is: $" + totalTax + "\nNet income is: $" + salaryAfterTax);




    }














}
