package Patterns;
/*
10 20 30 40 
*  50 60 70 
*  *  80 90 
*  *  *  100 

 
 */

public class Pattern18 {

	public static void main(String[] args) {
		int c=10;
		int n=4;
		int x=n;
		for(int i=0;i<n;i++) {
			for(int j=0;j<i;j++) {
				System.out.print("*  ");
			}
			for(int k=0;k<x;k++) {
				System.out.print(c+" ");
				c+=10;
			}
			x--;
			System.out.println();
		}
		

	}

}
