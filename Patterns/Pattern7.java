package Patterns;

/*
 
* 
* * 
* * * 
* * * * 
* * * * * 
* * * * * * 
* * * * * 
* * * * 
* * * 
* * 
*

*/



public class Pattern7 {

	public static void main(String[] args) {
		
		int c=1;
		for (int i = 0; i <=10; i++) {
			for (int j = 1; j <=c; j++) {
				System.out.print("* ");
			}
			System.out.println();
			if(i<5)
				c++;
			else
				c--;
			
		}

	}

}
