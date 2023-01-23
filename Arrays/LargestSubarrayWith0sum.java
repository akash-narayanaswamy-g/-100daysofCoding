package ArrayProblems;

//Largest subarray with 0 sum
//https://practice.geeksforgeeks.org/problems/largest-subarray-with-0-sum/1?category[]=Hash&category[]=Hash&company[]=Amazon&company[]=Amazon&page=1&query=category[]Hashcompany[]Amazonpage1company[]Amazoncategory[]Hash&utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=largest-subarray-with-0-sum

import java.util.*;

public class LargestSubarrayWith0sum {

	public static void main(String[] args) {
		int N = 8;
		int	A[] = {15,-2,2,-8,1,7,10,23};
		System.out.println(maxLen(A, N));

	}
	static int maxLen(int arr[], int n)
    {
        Map<Integer,Integer> m=new HashMap<>();
        int sum=0,max=0;
        for(int i=0;i<n;i++)
        {
            sum+=arr[i];
            if(sum==0)
                max=i+1;
            else
            {
            if(!m.containsKey(sum)){
                m.put(sum,i);
            }
            else{
                max=Math.max(i-m.get(sum),max);
            }
        }
    }
        return max;

}
}