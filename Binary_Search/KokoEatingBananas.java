package Binary_Search;

//875. Koko Eating Bananas
//https://leetcode.com/problems/koko-eating-bananas/description/

public class KokoEatingBananas {

	public static void main(String[] args) {
		int[] piles = {3,6,7,11};
		int h = 8;
		System.out.println(minEatingSpeed(piles, h));

	}
	
	public static int minEatingSpeed(int[] piles, int h) {
		int max=0;
        for (int i = 0; i < piles.length; i++) {
			max=Math.max(max, piles[i]);
		}
        int s=0,l=max;
        int ans=0;
        while(s<=l) {
        	int mid=s+(l-s)/2;
        	if(isSpeed(piles,mid,h)) {
        		ans=mid;
        		l=mid-1;
        	}
        	else s=mid+1;
        }
        return ans;
    }

	private static boolean isSpeed(int[] piles, int mid, int h) {
		int time=0;
		for (int i = 0; i < piles.length; i++) {
			time+=Math.ceil(piles[i]*1.0/mid);
		}
		return time<=h;
	}

}
