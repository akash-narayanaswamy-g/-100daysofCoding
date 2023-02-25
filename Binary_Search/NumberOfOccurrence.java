package Binary_Search;
//Number of occurrence
//https://practice.geeksforgeeks.org/problems/number-of-occurrence2259/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=number-of-occurrence


public class NumberOfOccurrence {

	public static void main(String[] args) {
		int N = 7, X = 2;
		int Arr[] = {1, 1, 2, 2, 2, 2, 3};
		System.out.println(count(Arr, N, X));

	}
	
	static int count(int[] arr, int n, int x) {
        // code here
        int ans=0;
        
        int l=srh(arr,x,true);
        int u=srh(arr,x,false);
        
        if(l==-1 || u==-1){
            return 0;
        }
        int res=Math.abs(l-u);
        
        return (res+1);
    }
    public static int srh(int[] arr,int target,boolean first){
        int ans=-1;
        int s=0;
        int e=arr.length-1;
        while(s<=e){
            int mid=s+(e-s)/2;
            if(target<arr[mid]){
                e=mid-1;
            }else if(target>arr[mid]){
                s=mid+1;
            }else{
                ans=mid;
                if(first){
                    e=mid-1;
                }else{
                    s=mid+1;
                }
            }
        }
        return ans;
    }

}
