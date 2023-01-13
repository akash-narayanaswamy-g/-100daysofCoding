package String_Problems;

//151. Reverse Words in a String
//https://leetcode.com/problems/reverse-words-in-a-string/description/

public class ReverseWordsInAString {

	public static void main(String[] args) {
		String s = "a good   example";
		String s2="i.like.this.program.very.much";
		System.out.println(reverseWords_geeks(s2));

	}
	public static String reverseWords(String s) {
    StringBuilder ans=new StringBuilder();
    StringBuilder temp=new StringBuilder();
    for (int i = s.length()-1; i >=0; i--) {
		if(s.charAt(i)!=' ')temp.append(s.charAt(i));
		if((s.charAt(i)==' ' || i==0) && temp.length()>0) {
			if( ans.length()>0 ) ans.append(" ");
			temp.reverse();
			ans.append(temp);
			temp.setLength(0);
		}
	}
    return ans.toString().strip();
    }
	
	public static String reverseWords_geeks(String s) {
		StringBuilder ans=new StringBuilder();
        for (int i = s.split(".").length-1; i >=0; i--) {
    		ans.append("."+s.split(".")[i]);
    	}
        return ans.toString();
	    }

}