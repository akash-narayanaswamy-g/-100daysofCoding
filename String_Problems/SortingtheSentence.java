package String_Problems;

import java.util.Arrays;

public class SortingtheSentence {

	public static void main(String[] args) {
		String s="is2 sentence4 This1 a3";
		System.out.println(sortSentence(s));

	}
	
	public static String sortSentence(String s) {
		String[] arr=s.split(" ");
		System.out.println(Arrays.toString(arr));
		return "";
        
    }

}
