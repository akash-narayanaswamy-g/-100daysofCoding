package Patterns;
/*
170 180 190 200 
140 150 160 
120 130 
110 

 */

public class Pattern19 {

	public static void main(String[] args) {
		int n=4;
		int c=170;
		int q=n-1;
		for(int i=0;i<n;i++) {
			for(int j=0;j<n-i;j++) {
				System.out.print(c+" ");
				c+=10;
			}
			c-=(n*5*q)+10;
			q--;
			System.out.println();
		}


	}
}
