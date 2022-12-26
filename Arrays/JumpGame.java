package ArrayProblems;

//55. Jump Game
//https://leetcode.com/problems/jump-game/

public class JumpGame {

	public static void main(String[] args) {
		int[] arr= {2,3,1,1,4};
		System.out.println(canJump(arr));
		

	}
	
	public static boolean canJump(int[] arr) {
        int reachable =0;
      for(int i=0;i<arr.length-1;i++){
          int val=i+arr[i];
          if(val>reachable){
              reachable=val;
          }
          if(i>=reachable){
              return false;
          }
      }
      return true;
    }

}
