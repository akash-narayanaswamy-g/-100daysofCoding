package ArrayProblems;
import java.util.*;

//118. Pascal's Triangle
//https://leetcode.com/problems/pascals-triangle/description/
public class PascalsTriangle {

	public static void main(String[] args) {
		int numRows = 5;
		System.out.println(generate(numRows));

	}
	
    public static List<List<Integer>> generate(int numRows) {
    	List<List<Integer>> result = new ArrayList<>();
        ArrayList<Integer> list = new ArrayList<>();
       ArrayList<Integer> ad = new ArrayList<>();
        list.add(1);
        result.add(list);

        for(int i=0;i<numRows-1;i++){
            list = new ArrayList<>();
            list.add(1);
            for(int j=0;j<i;j++){
                list.add(ad.get(j)+ad.get(j+1));
            }
            list.add(1);
            result.add(list);
            ad=list;
        }

    return result;

    }

	

}
