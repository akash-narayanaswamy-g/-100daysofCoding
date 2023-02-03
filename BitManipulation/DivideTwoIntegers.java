package BitManipulation;

public class DivideTwoIntegers {

	public static void main(String[] args) {
		int dividend = 10, divisor = 3;
		System.out.println(divide(dividend, divisor));

	}
	
	public static int divide(int dividend, int divisor) {
		int sign=(dividend<0)^(divisor<0)?-1:1;
		
		dividend=Math.abs(dividend);
		divisor=Math.abs(divisor);
		
		int quotient=0,temp=0;
		for (int i = 31; i >=0; i--) {
			if(temp+(divisor<<i)<=dividend) {
				temp+=divisor<<i;
				quotient+=1<<i;
			}
		}
//		while (dividend>=divisor) {
//			quotient++;
//			dividend-=divisor;
//		}

		return quotient*sign;
    }

}
