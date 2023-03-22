package ArrayProblems;

//1572. Matrix Diagonal Sum

public class MatrixDiagonalSum {

	public static void main(String[] args) {
		int[][] mat = {{1,2,3},
	              {4,5,6},
	              {7,8,9}};
		System.out.println(diagonalSum(mat));

	}
	
    public static int diagonalSum(int[][] mat) {
        int leftDiagSum = 0;
        int rightDiagSum = 0;
        for(int i = 0 ; i < mat.length ; i++)
        {
            int j = mat.length - i - 1;
            int a = mat[i][i];
            int b = mat[i][j];
            if(i == j)
            {
                leftDiagSum += a;
            }
            else
            {
                leftDiagSum += a;
                rightDiagSum += b;
            }
        }
        return (leftDiagSum + rightDiagSum);
    }


}
