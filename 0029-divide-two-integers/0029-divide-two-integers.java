class Solution {
    public int divide(int dividend, int divisor) {
       
      if(dividend == Integer.MIN_VALUE && divisor == -1){
            return Integer.MAX_VALUE;
       }

       boolean negative = (dividend < 0) ^ (divisor < 0);
       long dividendValue = Math.abs((long) dividend);
       long divisorValue = Math.abs((long) divisor);
       long quotient = 0;

       while(dividendValue >= divisorValue){
        long value = divisorValue;
        long multiple = 1;

        while(dividendValue >= (value << 1)){
            value <<= 1;
            multiple <<= 1;
        }

        dividendValue -= value;
        quotient += multiple;
       }

       return (int) (negative ? -quotient : quotient);
       
    }
}