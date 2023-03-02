package Binary_Search;

//1482. Minimum Number of Days to Make m Bouquets
//https://leetcode.com/problems/minimum-number-of-days-to-make-m-bouquets/

public class MinimumNumberOfDaysToMakemBouquets {

	public static void main(String[] args) {
		int[] bloomDay = {1,10,3,10,2}; 
		int boq = 3, flowers = 1;
		System.out.println(minDays(bloomDay, boq, flowers));

	}
	
	public static int minDays(int[] bloomDay, int boq, int flowers) {
		int min=0,max=0,ans=bloomDay.length;
        for(int i=0;i<bloomDay.length;i++) {
        	min=Math.min(min, bloomDay[i]);
        	max=Math.max(max, bloomDay[i]);
        }
        
        while(min<=max) {
        	int mid=min+(max-min)/2;
        	if(isPossibleSoln(bloomDay,boq,flowers,mid)) {
        		ans=mid;
        		max=mid-1;
        	}
        	else
        		min=mid+1;
        }
        return ans;
    }

	private static boolean isPossibleSoln(int[] bloomDay, int boq, int flowers, int mid) {
		int adj=0,boqcount=0;
		for (int i = 0; i < bloomDay.length; i++) {
			if(bloomDay[i]<=mid) {
				adj++;
				if(adj==flowers) {
					boqcount++;
					if(boq==boqcount)
						return true;
					adj=0;
				}
			}
			else
				adj=0;
		}
		return false;
	}

}
