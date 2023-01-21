package ArrayProblems;

//54. Spiral Matrix
//https://leetcode.com/problems/spiral-matrix/description/
import java.util.*;

public class SpiralMatrix {

	public static void main(String[] args) {
		int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
		System.out.println(spiralOrder(matrix));

	}
	
	public static List<Integer> spiralOrder(int[][] arr) {
		List<Integer> res = new ArrayList<Integer>();
		int minR =0;
        int minC=0;
        int maxR= arr.length-1;
        int maxC = arr[0].length-1;
        int t =arr[0].length*arr.length;
        int count=0;
        while(count<t){
            //top
            for(int i =minC;i<=maxC && count<t ;i++){
                res.add(arr[minR][i]);
                count++;
            }
            minR++;

            //right
            for(int i =minR;i<=maxR && count<t;i++){
                res.add(arr[i][maxC]);
                count++;
            }
            maxC--;
            //bottom
            for(int i = maxC;i>=minC&&count<t;i--){
                res.add(arr[maxR][i]);
                count++;
            }
            maxR--;
            //left 
            for(int i=maxR;i>=minR && count<t;i--){
                res.add(arr[i][minC]);
                count++;
            }
            minC++;
        }
        return res;
    }

}
