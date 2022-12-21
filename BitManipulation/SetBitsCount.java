package BitManipulation;

public class SetBitsCount {

	public static void main(String[] args) {
		int n=3;
		System.out.println("Binary representation of the number : "+Integer.toBinaryString(n));
		System.out.println("Count of set bit(no of ones) : "+setbit(n));
		System.out.println("Count of set bit(no of ones)-method2 : "+setbitMethod2(n));
		System.out.println("Count of set bit(no of ones)-method3 : "+setbitMethod3(n));
		
	}
	public static int setbit(int n) {
		int c=0;
		while(n>0) {
			if((n&1)==1)
				c++;
			n=n>>1;
		}
		return c;
	}
	public static int setbitMethod2(int n) {
		int c=0;
		while(n>0) {
			c++;
			n-=(n&-n);//deleting 1 ,by each at a time using its compliment
		}
		return c;
	}
	
	public static int setbitMethod3(int n) {
		int c=0;
		while(n>0) {
			c++;
			n=n&(n-1);
		}
		return c;
	}

}
