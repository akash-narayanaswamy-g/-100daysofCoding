package ArrayProblems;

//2114. Maximum Number of Words Found in Sentences
//https://leetcode.com/problems/maximum-number-of-words-found-in-sentences/description/

public class MaximumWordsInSentences {

	public static void main(String[] args) {
		String[] s= {"alice and bob love leetcode", "i think so too", "this is great thanks very much"};
		System.out.println(mostWordsFound(s));

	}
	public static int mostWordsFound(String[] sentences) {
        int countMax=0;
        for (String n : sentences) {
        	int count=n.split(" ").length;
        	if(countMax<count)
        		countMax=count;
		}
        return countMax;
    }

}
