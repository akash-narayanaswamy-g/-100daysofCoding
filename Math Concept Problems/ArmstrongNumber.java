package MathConceptProblems;

//https://practice.geeksforgeeks.org/problems/armstrong-numbers2727/1

public class ArmstrongNumber {

	public static void main(String[] args) {
		int num=153;
		int n=num;
		int y=0;
		while(n>0) {
			int r=n%10;
			r=r*r*r;
			y+=r;
			n/=10;
		}
		System.out.println(y+" "+num);
		
		if(num==y)
			System.out.println("ArmstrongNumber");
		else
			System.out.println("not a ArmstrongNumber");

	}

}
