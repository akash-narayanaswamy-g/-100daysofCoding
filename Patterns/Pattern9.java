package Patterns;

public class Pattern9 {

	public static void main(String[] args) {
		int c=1;
		for(int i=0;i<5;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print(c+" ");
				c++;
			}
			System.out.println();
		}

	}

}
