package Patterns;

/*
A B C D E 
A B C D 
A B C 
A B 
A 
 */

public class Pattern16 {

	public static void main(String[] args) {
		for(int i=0;i<5;i++) {
			int c=65;
			for(int j=0;j<5-i;j++) {
				System.out.print((char)(c+j)+" ");
			}
			System.out.println();
		}

	}

}
