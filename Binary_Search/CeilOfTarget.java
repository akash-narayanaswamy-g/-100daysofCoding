package Binary_Search;
//744. Find Smallest Letter Greater Than Target
//https://leetcode.com/problems/find-smallest-letter-greater-than-target/

public class CeilOfTarget {

	public static void main(String[] args) {
		char[] arr= {'c','f','j'};
		char target='a';
		System.out.println(nextGreatestLetter(arr, target));

	}
	
	public static char nextGreatestLetter(char[] letters, char target) {
        int start=0;
        int end=letters.length-1;
        while(start<=end) {
        	int mid=start+(end-start)/2;
        	if(letters[mid]>target)
        		end=mid-1;
        	else
        		start=mid+1;
        }
        return letters[start%letters.length];
        
    }
	

}
