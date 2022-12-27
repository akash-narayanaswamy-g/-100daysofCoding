package ArrayProblems;

//2279. Maximum Bags With Full Capacity of Rocks
//https://leetcode.com/problems/maximum-bags-with-full-capacity-of-rocks/description/

import java.util.*;

public class BagFilling {

	public static void main(String[] args) {
		int[] capacity= {2,3,4,5};
		int[] rocks= {1,2,4,4};
		System.out.println(maximumBags(capacity, rocks, 2));

	}
	
	public static int maximumBags(int[] capacity, int[] rocks, int additionalRocks) {
        int n=capacity.length;
        int count=0;
        for(int i=0;i<n;i++){
            capacity[i]-=rocks[i];            
        }
        Arrays.sort(capacity);
       
        for(int i=0;i<n;i++){
            additionalRocks-=capacity[i];
            
            if(additionalRocks>=0){
                count++;
            }
            else{
                break;
            }
               
        }
        return count;
        
	}
}
