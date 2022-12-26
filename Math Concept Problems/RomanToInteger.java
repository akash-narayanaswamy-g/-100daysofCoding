package MathConceptProblems;

//13. Roman to Integer
//https://leetcode.com/problems/roman-to-integer/description/

public class RomanToInteger {

	public static void main(String[] args) {
		System.out.println(romanToInt("VIII"));
		
	}
	
	public static int romanToInt(String s) {
        int curr=0;
        int prev=0;
        int ans=0;
        for(int i = s.length() - 1; i >= 0; i--){
        switch(s.charAt(i)){
            case 'I'->curr=1;
            case 'V'->curr=5;
            case 'X'->curr=10;
            case 'L'->curr=50;
            case 'C'->curr=100;
            case 'D'->curr=500;
            case 'M'->curr=1000;
        }
        if(prev>curr)
            ans-=curr;
        else{
            ans+=curr;
            prev=curr;
        }}
        return ans;
    }

}
