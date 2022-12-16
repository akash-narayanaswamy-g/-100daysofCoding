package Patterns;

/*
A 
A B 
A B C 
A B C D 
A B C D E 
 */

public class Pattern15 {

	public static void main(String[] args) {
		for(int i=0;i<5;i++) {
			int ch=65;
			for(int j=0;j<=i;j++) {
				System.out.print((char)(ch+j)+" ");
			}
			System.out.println();
		}

	}

}
