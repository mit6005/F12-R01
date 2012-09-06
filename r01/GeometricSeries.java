class GeometricSeries {

    public static void main(String[] args) {
        // 1 + 2 + 4 + 8 + 16 = 31
        System.out.println("This geometric series should yield 31!");
        double doublingIterative = geometricSeriesIterative(1, 2, 5);
        System.out.println("\tYour iterative solution yields: " + doublingIterative);
        double doublingRecursive = geometricSeriesRecursive(1, 2, 5);
        System.out.println("\tYour recursive solution yields: " + doublingRecursive);
        System.out.println();

        // 1 + 2 + 4 + 8 + 16 + ... + 2^30 = 2^31 - 1
        System.out.println("This geometric series should yield 2147483647!");
        doublingIterative = geometricSeriesIterative(1, 2, 31);
        System.out.println("\tYour iterative solution yields: " + doublingIterative);
        doublingRecursive = geometricSeriesRecursive(1, 2, 31);
        System.out.println("\tYour recursive solution yields: " + doublingRecursive);

        // 1 + 2 + 4 + 8 + 16 + ... + 2^30 = 2^31 - 1
        int doublingInteger = geometricSeriesIntegers(1, 2, 31);
        System.out.println("\tYour iterative integer solution yields: " + doublingInteger);
        // 1 + 2 + 4 + 8 + 16 + ... + 2^31 = 2^32 - 1
        System.out.println("This geometric series should yield 4294967295!");
        doublingInteger = geometricSeriesIntegers(1, 2, 32);
        System.out.println("\tYour iterative integer solution yields: " + doublingInteger);
        System.out.println();
        
        // 1 + 1/2 + 1/4 + 1/8 + 1/16 = 1.9375
        System.out.println("This geometric series should approach 2!");
        double halvingIterative = geometricSeriesIterative(1, 0.5, 5);
        System.out.println("\tYour iterative solution yields: " + halvingIterative);
        double halvingRecursive = geometricSeriesRecursive(1, 0.5, 5);
        System.out.println("\tYour recursive solution yields: " + halvingRecursive);
        
        // 1 + 1/2 + 1/4 + 1/8 + ... ~ 2
        System.out.println("This geometric series should approach 2!");
        halvingIterative = geometricSeriesIterative(1, 0.5, 10000);
        System.out.println("\tYour iterative solution yields: " + halvingIterative);
        halvingRecursive = geometricSeriesRecursive(1, 0.5, 10000);
        System.out.println("\tYour recursive solution yields: " + halvingRecursive);
    }
    
    /**
     * Iteratively computes a geometric series of the form:
     *      start  +  start*ratio  +  start*ratio^2  + ... +  start*ratio^(steps-1)
     * 
     * @param start
     *              Starting value in the geometric series (must be double)
     * @param ratio
     *              Common ratio (must be double)
     * @param steps
     *              Number of elements to be added in the series (must be int)
     * @return value of start  +  start*ratio  + ... +  start*ratio^(steps-1)
     */
    static double geometricSeriesIterative(double start, double ratio, int steps) {
        // TODO Complete this implementation!
        throw new RuntimeException("geometricSeriesIterative has not been implemented!");
    }
    
    
    /**
     * Recursively computes a geometric series of the form:
     *      start  +  start*ratio  +  start*ratio^2  + ... +  start*ratio^(steps-1)
     * 
     * @param start
     *              Starting value in the geometric series (must be double)
     * @param ratio
     *              Common ratio (must be double)
     * @param steps
     *              Number of elements to be added in the series (must be int)
     * @return value of start  +  start*ratio  + ... +  start*ratio^(steps-1)
     */
    static double geometricSeriesRecursive(double start, double ratio, int steps) {
        return geometricSeriesRecursiveHelper(0, start, ratio, steps);
    }

    /**
     * Helper function for recursive implementation
     */
    private static double geometricSeriesRecursiveHelper(double sum, double start, double ratio, int steps) {
        // TODO Complete this implementation!
        throw new RuntimeException("geometricSeriesRecursiveHelper has not been implemented!");
    }
    
    
    /**
     * Computes a geometric series of the form:
     *      start  +  start*ratio  +  start*ratio^2  + ... +  start*ratio^(steps-1)
     * where all the parameters are of int types.
     * 
     * @param start
     *              Starting value in the geometric series (must be int)
     * @param ratio
     *              Common ratio (must be int)
     * @param steps
     *              Number of elements to be added in the series (must be int)
     * @return value of start  +  start*ratio  + ... +  start*ratio^(steps-1)
     */
    static int geometricSeriesIntegers(int start, int ratio, int steps) {
        // TODO Complete this implementation!
        throw new RuntimeException("geometricSeriesIntegers has not been implemented!");
    }
}
