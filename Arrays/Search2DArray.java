package ArrayProblems;

import java.util.*;

public class Search2DArray {

	public static void main(String[] args) {
		int[][] a= {
				{11,55,99},
				{77,554,33},
				{88,97,44,66}
		};
		int target=88;
		System.out.println(Arrays.toString(search(a, target)));
	}
	
	static int[] search(int[][] a,int target) {
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				if(a[i][j]==target)
					return new int[]{i,j};
			}
		}
		return new int[]{-1,-1};
	}

}
