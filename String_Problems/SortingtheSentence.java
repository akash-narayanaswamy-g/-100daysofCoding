package String_Problems;

//https://leetcode.com/problems/sorting-the-sentence/
//1859. Sorting the Sentence

import java.util.Arrays;

public class SortingtheSentence {

	public static void main(String[] args) {
		String s="is2 sentence4 This1 a3";
		System.out.println(sortSentence(s));

	}
	
	public static String sortSentence2(String s) {
		String[] arr=s.split(" ");
		System.out.println(Arrays.toString(arr));
		return "";
        
    }
	
	 public static String sortSentence(String s) {
	        String a[] = s.split(" ");
	        int n = a.length;
	        String b[] = new String[n];
	        for(int i=0; i<n; i++)
	        {
	            int l = a[i].length();
	            char p = a[i].charAt(l-1);
	            int k = p - '0';
	            b[k-1] = a[i].substring(0,l-1);
	        }
	        String str="";
	        for(int i=0; i<n; i++)
	        {
	            str = str + b[i] + " ";
	        }
	        return str.trim();
	    }

}
