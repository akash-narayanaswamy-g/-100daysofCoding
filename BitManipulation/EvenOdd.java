package BitManipulation;

//Odd or Even
//https://practice.geeksforgeeks.org/problems/odd-or-even3618/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=Odd+or+Even

public class EvenOdd {

		public static void main(String[] args) {
			int n=67+1;
			System.out.println(isOdd(n));

		}
		
		public static boolean isOdd(int n) {
			return (n&1)==1;
		}
		
		static String oddEven(int N){
	        if((N&1)==1)
	            return "odd";
	        else
	            return "even";
	    }

}
