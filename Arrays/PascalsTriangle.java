package ArrayProblems;
import java.util.*;

public class PascalsTriangle {

	public static void main(String[] args) {
		int numRows = 5;
		System.out.println(generate(numRows));

	}
	
    public static List<List<Integer>> generate(int numRows) {
    	if(numRows == 0) return new ArrayList();
        List<List<Integer>> res = new ArrayList();

        for(int i = 1; i <= numRows; i++){
            List<Integer> row = new ArrayList();
            for(int j = 0 ; j < i ; j++){
                if(j == 0  || j== i-1){
                    row.add(1);
                }else{
                    row.add(res.get(i-2).get(j) + res.get(i-2).get(j-1));
                }       
            }
            res.add(row);
        }
        return res;

    }

	

}
