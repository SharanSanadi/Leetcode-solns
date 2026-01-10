class Solution {
    public double myPow(double x, int n) {
        if (n == 0) { //anyting to power 0 is 1
            return 1;
        }

        double temp = myPow(x, n / 2);

        if (n % 2 == 0) { // even number 
            return temp * temp;
        } 
        else if (n > 0) { //positive odd
            return temp * temp * x;
        } 
        else { // negative odd
            return (temp * temp) / x;
        }
    }
}
