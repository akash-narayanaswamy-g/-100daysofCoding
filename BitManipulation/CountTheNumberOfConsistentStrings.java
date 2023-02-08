package BitManipulation;

//1684. Count the Number of Consistent Strings
//https://leetcode.com/problems/count-the-number-of-consistent-strings/
public class CountTheNumberOfConsistentStrings {

	public static void main(String[] args) {
		String allowed = "ab";
		String[] words = {"ad","bd","aaab","baa","badab"};
		System.out.println(countConsistentStrings(allowed, words));

	}
	
	public static int countConsistentStrings(String allowed, String[] words) {
		int count = words.length;
        int bitset = 0;
        for (char c : allowed.toCharArray()) {
            bitset |= 1 << c - 'a';
        }

        for (String word : words) {
            for (char c : word.toCharArray()) {
                if ((bitset & (1 << c - 'a')) == 0) {
                    count--;
                    break;
                }
            }
        }
        return count;   
    }

}
