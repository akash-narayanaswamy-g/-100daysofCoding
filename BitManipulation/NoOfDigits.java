package BitManipulation;

public class NoOfDigits {

	public static void main(String[] args) {
		int n=6;
		int base=10;
		
		int digits=(int)(Math.log(n)/Math.log(base))+1;
		System.out.println(digits);
		digitsInBinary(n);

	}
	public static void digitsInBinary(int n) {
		int c=0;
		while(n>0) {
			c++;
			n=n>>1;
		}
		System.out.println(c);
	}

}
