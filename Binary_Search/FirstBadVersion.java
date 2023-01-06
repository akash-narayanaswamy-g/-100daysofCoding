package Binary_Search;

//https://leetcode.com/problems/first-bad-version/description/
//278. First Bad Version

abstract class VersionControl{
	boolean isBadVersion(int version);
}

public class FirstBadVersion extends VersionControl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public static int firstBadVersion(int n) {
		public int firstBadVersion(int n) {
	         int s=0;
	         while(s+1<n){
	             int mid=s+(n-s)/2;
	             if(isBadVersion(mid))
	                n=mid;
	            else
	                s=mid;
	         }
	         if(isBadVersion(s))
	            return s;
	        return n;
	    }
   }

}
