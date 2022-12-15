package Patterns;

/*
1 
0 1 
0 1 0 
1 0 1 0 
1 0 1 0 1 

 */

public class Pattern8 {

	public static void main(String[] args) {
		int c=1;
		for(int i=0;i<5;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print(c+" ");
				c=c==0?1:0;
			}
			System.out.println();
		}
	}

}
