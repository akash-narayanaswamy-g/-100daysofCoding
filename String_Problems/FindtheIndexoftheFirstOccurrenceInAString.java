package String_Problems;

import java.util.regex.*;

//28. Find the Index of the First Occurrence in a String
//https://leetcode.com/problems/find-the-index-of-the-first-occurrence-in-a-string/
public class FindtheIndexoftheFirstOccurrenceInAString {

	public static void main(String[] args) {
		String haystack = "sadbutsad", needle = "sad";
		System.out.println(strStr(haystack, needle));

	}
	
	public static int strStr(String haystack, String needle) {
        Pattern p=Pattern.compile(needle);
        Matcher m=p.matcher(haystack);
        while(m.find()){
            return m.start();
        }
        return -1;
    }

}
