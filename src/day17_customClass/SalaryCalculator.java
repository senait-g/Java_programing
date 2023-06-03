package day17_customClass;

public class SalaryCalculator {


    public int hourlyRate;
    public int weeklyHour;
    public double stateTaxRate;
    public double federalTaxRate;



    public void setInfo(int hourlyRate, int weeklyHour, double stateTaxRate, double federalTaxRate) {
        this.hourlyRate = hourlyRate;
        this.weeklyHour = weeklyHour;
        this.stateTaxRate = stateTaxRate;
        this.federalTaxRate = federalTaxRate;

    }

    public String toString() {
        return "SalaryCalculator{" +
                "hourlyRate=" + hourlyRate +
                ", weeklyHour=" + weeklyHour +
                ", stateTaxRate=" + stateTaxRate +
                ", federalTaxRate=" + federalTaxRate +
                '}';
    }

    public void setSalary(){

        System.out.println( "Month salary is:" + hourlyRate * weeklyHour * 52);
    }
    public void setStateTaxRate(){

        System.out.println("stateTaxRate amount is:" + stateTaxRate);
    }
    public void setFederalTaxRate(){
        System.out.println("federalTaxRate is:" + federalTaxRate);

    }
   // public void setSalaryAfterTax(){

     //  System.out.println("SalaryAfterTax is:" + (salary-(stateTaxRate * salary) + (federalTaxRate * salary)));
   // }


}
/*
 Create a custom class named SalaryCalculator
        Attributes:
            hourlyRate, stateTaxRate, federalTaxRate, weeklyHours

            (stateTaxRate and federalTaxRate will be given as percentage,
             you will responsible for converting them to decimals)

        Actions:
            setInfo(): sets all the fields of SalaryCalculator object
            salary(): calculates the salary ( hourlyRate * weeklyHour * 52) and returns it as double
            stateTax(): calculates the total state tax, and returns it as double
            federalTax(): calculates the total federal tax, and returns it as double
            salaryAfterTax(): calculates the salary after tax, and returns it as double
            toString(): when a SalaryCalculator object is passed in print statement,
            	it should displays the salary, stateTax, federalTax, salaryAfterTax of the Object
 */