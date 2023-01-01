package Binary_Search;

class MountainArray {
		 int arr[]= {1,5,2};
	     public int get(int index) {
	    	return arr[index]; 
	     }
	     public int length() {
	    	 return arr.length;
	     };
	  }

public class MountainArraySearch {

	public static void main(String[] args) {
	 MountainArray obj=new MountainArray();
	 int  target = 2;
	 System.out.println(findInMountainArray(target, obj));
	}
	
	
	public static int findInMountainArray(int target, MountainArray mountainArr) {
        
        int peak=peakIndexInMountainArray(mountainArr);
        int ans=AgnosticSearch(mountainArr, target, 0, peak-1);
        if(ans!=-1)
        	return ans;
        return AgnosticSearch(mountainArr, target, peak, mountainArr.length()-1);
        
      
    }
	public static int peakIndexInMountainArray(MountainArray mountainArr) {
	       int s=0,l=mountainArr.length()-1;
			while(s<l) {
	    	   int mid=s+(l-s)/2;
	    	   if(mountainArr.get(mid)>mountainArr.get(mid+1))
	    		   l=mid;
	    	   else if(mountainArr.get(mid)<mountainArr.get(mid+1))
	    		   s=mid+1;
				       }

	       return s;	        
	    }
	
	static int AgnosticSearch(MountainArray mountainArr,int target,int start,int end) {
			
		boolean isAsc=mountainArr.get(start)<mountainArr.get(end);
		while (start<=end) {
			int mid=start+(end-start)/2;
			if(mountainArr.get(mid)==target)
				return mid;
			else if(isAsc) {
				if(mountainArr.get(mid)>target)
					end=mid-1;
				else
					start=mid+1;
			}
			else {
				if(mountainArr.get(mid)<target)
					end=mid-1;
				else
					start=mid+1;
			}
			
	}
		return -1;

}

}
