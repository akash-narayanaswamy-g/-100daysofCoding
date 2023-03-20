package BitManipulation;

//50. Pow(x, n)
public class Pow_x_n {

	public static void main(String[] args) {
		double x = 2.00000;
		int n = 10;
		System.out.println(myPow(x, n));

	}
	
	public static double myPow(double x, int n) {
        if (n == 0) 
            return 1.0;

        if (n % 2 == 1) 
            return x * myPow(x, n - 1);

        if (n % 2 == 0) 
            return myPow(x * x, n / 2);

        return 1 / myPow(x, -n);
    }

}
