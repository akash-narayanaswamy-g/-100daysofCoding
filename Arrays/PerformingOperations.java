package ArrayProblems;

//1486. XOR Operation in an Array
//https://leetcode.com/problems/xor-operation-in-an-array/description/
public class PerformingOperations {

	public static void main(String[] args) {
		String s[]= {"--X","X++","X++"};
		System.out.println(finalValueAfterOperations(s));

	}
	
	public static int finalValueAfterOperations(String[] operations) {
		int x=0;
		for (String i :operations) {
			
			switch (i) {
			case "--X" ->x-=1;
			case "X--" ->x-=1;
			case "X++" ->x+=1;			
			default ->x+=1;	
			}
		}
		return x;
        
    }
	/*optimal solution
	  public int xorOperation(int n, int start) {
        int xor=0;
        for (int i = 0; i<n; i++)
            xor ^= start + 2*i;
        return xor;
    }
	 */

}
