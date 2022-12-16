package Patterns;

/*
          * 
        * * * 
      * * * * * 
    * * * * * * * 
  * * * * * * * * * 
* * * * * * * * * * * 
  * * * * * * * * * 
    * * * * * * * 
      * * * * * 
        * * * 
          * 
 */

public class Pattern13 {

	public static void main(String[] args) {
		int n=10;
		int count=0,c=1;
		for (int i = 0; i <= n; i++) {
			count=count<=n?(n/2)-c+5:c;
			for (int j = 0; j <=count; j++) {
				System.out.print(" ");
			}
			for (int k = 0; k < c; k++) {
				System.out.print("* ");
				}
			System.out.println();
			if(i<=(n/2)-1)
				c+=2;
			else
				c-=2;
							
		}
	}

}
