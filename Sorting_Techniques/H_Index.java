package Sorting_Techniques;
import java.util.*;

//274. H-Index
//https://leetcode.com/problems/h-index/description/

public class H_Index {

	public static void main(String[] args) {
		int[] citations = {3,0,6,1,5};
		System.out.println(hIndex(citations));
	}
	
	public static int hIndex(int[] citations) {
        Arrays.sort(citations);
    int n=citations.length;
    int index=0;
       while(index<n && citations[index]<n-index)
       {
           index++;
       }
    return n-index;
    }

}
