package staff.impl;

class FinancialCalc {

    public static void main(String[] args) {
        System.out.println("Investing $" + 1000
                + " at an interest rate of " + 0.035 + "%"
                + " for " + 7 + " years"
                + " will have a final worth of $" 
                + computeFinalValue(1000, 0.035, 7));
        // answer: $1272.28
        
        System.out.println("To have $1000 after 4 years at 5% interest rate, "
                         + "you should invest $"
                         + computePrincipal(1000, 0.05, 4));
        // answer: $822.70
        
        System.out.println("To grow $500 into $525 in 3 years, you need interest rate "
                           + (computeInterestRate(525, 500, 3) * 100) + "%");
        // answer: 1.64%
        
        System.out.println("To grow $100 into $150 at 4.4%, you need "
                         + computeNumOfYears(150, 100, 0.044) + " years");
        // answer: 9.42 years
    }
    
    static double computeFinalValue(double principal,
                                    double interestRate,
                                    int numOfYears) {
        return principal * Math.pow((1 + interestRate), numOfYears);
    }
    
    static double computePrincipal(double finalValue,
                                   double interestRate,
                                   int numOfYears) {
        return finalValue / Math.pow((1 + interestRate), numOfYears);
    }

    static double computeInterestRate(double finalValue,
                                      double principal,
                                      int numOfYears) {
        return Math.pow(finalValue/principal, 1.0/numOfYears) - 1;
    }

    static double computeNumOfYears(double finalValue,
                                    double principal,
                                    double interestRate) {
        return Math.log(finalValue / principal) / Math.log(1 + interestRate);
    }

}
