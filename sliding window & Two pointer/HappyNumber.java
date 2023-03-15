package Sliding_Window;

//202. Happy Number
public class HappyNumber {

	public static void main(String[] args) {
		int n = 19;
		System.out.println(isHappy(n));
	}
	
	public static boolean isHappy(int n) {
        int slow=n;
        int fast=n;
        do {
        	slow=findsquare(slow);
        	fast=findsquare(findsquare(fast));
        }while(slow!=fast);
        if(slow==1)
        	return true;
        return false;
    }

	private static int findsquare(int n) {
		int ans=0;
		while(n>0) {
			int r=n%10;
			ans+=r*r;
			n/=10;
		}
		return ans;
	}

}
