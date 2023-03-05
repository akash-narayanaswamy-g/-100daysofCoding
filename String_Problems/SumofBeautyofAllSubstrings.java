package String_Problems;

public class SumofBeautyofAllSubstrings {

	public static void main(String[] args) {
		String s = "aabcb";
		System.out.println(beautySum(s));
	}
	
	public static int beautySum(String s) {
        int sum=0;
        for (int i = 0; i < s.length(); i++) {
        	int a[]=new int[26];
        	
			for (int j = i; j < s.length(); j++) {
				a[s.charAt(j)-'a']++;
				int min=Integer.MAX_VALUE,max=Integer.MIN_VALUE;
			
				for (int k = 0; k < 26; k++) {
					if(a[k]!=0) {
						min=Math.min(min, a[k]);
						max=Math.max(max, a[k]);
					}
				}
				sum+=(max-min);
        }
		}
        return sum;
    }

}
