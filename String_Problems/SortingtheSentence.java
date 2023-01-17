package String_Problems;

//https://leetcode.com/problems/sorting-the-sentence/
//1859. Sorting the Sentence

import java.util.Arrays;

public class SortingtheSentence {

	public static void main(String[] args) {
		String s="is2 sentence4 This1 a3";
		System.out.println(sortSentence(s));

	}
	
	public static String sortSentence(String s) {
		String[] arr=s.split(" ");
		System.out.println(Arrays.toString(arr));
		String[] ans=new String[arr.length+1];
		for (int i = 0; i < arr.length; i++) {
			int index=arr[i].length()-1;
			
			ans[arr[i].charAt(index)-'0']=arr[i].substring(0,index);
			System.out.println(Arrays.toString(ans));
		}
		s="";
		for (int i = 1; i < ans.length; i++) {
			s+=ans[i]+" ";
		}
		return s;
        
    }
	
}
