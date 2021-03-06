/**
 * Created by nata on 13.04.2017.
 */
class Tax {
    double grossIncome; // class member variables
    String state;
    int dependents;
    static int customerCounter;

    // Constructor
    Tax (double gi, String st, int depen){
        grossIncome = gi;  // member variable initialization
        state = st;
        dependents=depen;
        customerCounter++;   // increment the counter by one
        System.out.println("Preparing the tax data for customer #" + customerCounter);
    }
    double calcTax(){
        return (grossIncome*0.33 - dependents*100);
    }

    static double convertToE(double taxInS){
       double res = taxInS/1.25;
	System.out.println(res);
        return res; 
    }
}
