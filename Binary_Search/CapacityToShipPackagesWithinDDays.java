package Binary_Search;

//1011. Capacity To Ship Packages Within D Days
//https://leetcode.com/problems/capacity-to-ship-packages-within-d-days/description/

public class CapacityToShipPackagesWithinDDays {

	public static void main(String[] args) {
		int[] weights = {1,2,3,4,5,6,7,8,9,10};int days = 5;
		System.out.println(shipWithinDays(weights, days));

	}
	
	public static int shipWithinDays(int[] weights, int days) {
        int total=0,max=0;
        for(int i=0;i<weights.length;i++){
            total+=weights[i];
            max=Math.max(max,weights[i]);
        }

        while(max<total){
            int mid=max+(total-max)/2;
            if(ok(weights,mid,days))
                total=mid;
            else
                max=mid+1;                
        }
        return max;

    }

	static Boolean ok(int[] weights, int c, int days) {
        int daysNeeded = 1, currentLoad = 0;
        for (int weight : weights) {
            currentLoad += weight;
            if (currentLoad > c) {
                daysNeeded++;
                currentLoad = weight;
            }
        }

        return daysNeeded <= days;
    }

}
