package ArrayProblems;

import java.util.Arrays;

//48. Rotate Image
//https://leetcode.com/problems/rotate-image/

public class RotateImage {

	public static void main(String[] args) {
		int[][] matrix= {{1,2,3},{4,5,6},{7,8,9}};
		rotate(matrix);
		System.out.println(Arrays.deepToString(matrix));
	}
	
	public static void rotate(int[][] matrix) {
		
		//taking transpose
		for (int i = 0; i < matrix.length; i++) {
			for (int j = i+1; j < matrix[0].length; j++) {
				int t=0;
				t=matrix[i][j];
				matrix[i][j]=matrix[j][i];
				matrix[j][i]=t;
			}
		}
		
		//reversing the array
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix.length/2; j++) {
				int t=matrix[i][j];
				matrix[i][j]=matrix[i][matrix.length-1-j];
				matrix[i][matrix.length-1-j]=t;
			}
		}
        
    }

	private static void swap(int[][] matrix, int i, int j) {
		int t=matrix[i][j];
		matrix[i][j]=matrix[j][i];
		matrix[j][i]=t;
		
	}

}
