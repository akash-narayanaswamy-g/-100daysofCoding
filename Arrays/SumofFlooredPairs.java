package ArrayProblems;

//1862. Sum of Floored Pairs
public class SumofFlooredPairs {

	public static void main(String[] args) {
		int[] nums = {2,5,9};
		System.out.println(sumOfFlooredPairs(nums));
	}
	
	public static int sumOfFlooredPairs(int[] nums) {
        int N=(int)1e5;
        int mod=(int)1e9 + 7;
        
		
        int[] frequencyMap=new int[N+1];
        for(int num:nums) frequencyMap[num]++;
        
        int[] prefixFreq=new int[N+1];
        for(int i=1;i<=N;i++) prefixFreq[i]=prefixFreq[i-1] + frequencyMap[i];
        
        long total=0;
        
        for(int i=1;i<=N;i++){
            if(frequencyMap[i]==0) continue;
            
                 long sum=0;
                for(int j=1; i*j<=N;j++){
                   int lower=i*j-1;
                   int upper=i*(j+1)-1;
                   
                   int count= prefixFreq[Math.min(N,upper)] - prefixFreq[lower]; 
                   
                    sum+=count*j;;
                }
                total=(total + (sum%mod)*frequencyMap[i])%mod;
        }
        return (int)total;
    }

}
