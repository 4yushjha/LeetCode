class Solution {
    public double myPow(double x, int n) {
    
        long N = n;
        if (N < 0) {
            x = 1 / x;
            N = -N;
        }
        
        double result = 1.0;
        double currentProduct = x;
        
        while (N > 0) {
            if (N % 2 == 1) { // if N is odd
                result *= currentProduct;
            }
            currentProduct *= currentProduct; // square the base
            N /= 2; // halve the exponent
        }
        
        return result;
    }


}
  