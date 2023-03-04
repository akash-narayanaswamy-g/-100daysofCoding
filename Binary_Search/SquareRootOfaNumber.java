package Binary_Search;

//Square root of a number
//https://practice.geeksforgeeks.org/problems/square-root/0?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=square-root
public class SquareRootOfaNumber {

	public static void main(String[] args) {
		System.out.println(floorSqrt(5));

	}
	
	static long floorSqrt(long x)
	 {
//		long ans=0,s=1,l=x/2;
//		while(s<=l){
//		    long mid=s+(l-s)/2;
//		    if((mid*mid)<=x){
//		        ans=mid;
//		        s=mid+1;
//		    }
//		    else
//		        l=mid-1;
//		}
//		return ans;


//		long i=0L;
//        for(;i*i<=x;i++);
//        return i-1;

       long root=1;
       while((root*root)<=x){
           root++;
       }
       return root-1;
	 }

}
