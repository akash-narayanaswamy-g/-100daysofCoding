package Patterns;

/*
A 
B B 
C C C 
D D D D 
E E E E E 

 */

public class Pattern17 {

	public static void main(String[] args) {
		int c=65;
		for(int i=0;i<5;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print((char)c+" ");
			}
			c++;
			System.out.println();
		}

	}

}
