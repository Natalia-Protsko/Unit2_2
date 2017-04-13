
/**
 * Created by nata on 13.04.2017.
 */
public class TestTax {
	public static void main(String[] args){
            double grossIncome; // local variables
            String state;
            int dependents;

            grossIncome= 50000;
            dependents= 2;
            state= "NJ";

            Tax   t = new Tax(grossIncome, state, dependents);
            Tax   t2 = new Tax(65000, "TX", 4 );

            double yourTax = t.calcTax(); //calculating tax
            
            // Printing the result
            System.out.println("Your tax is " + yourTax);
            double YourTaxE = Tax.convertToE(yourTax);

            double hisTax = t2.calcTax();
            System.out.println("His tax is " + hisTax);
            double hisTaxE = Tax.convertToE(hisTax);

     } 
 }

