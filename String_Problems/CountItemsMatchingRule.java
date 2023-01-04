package String_Problems;

//1773. Count Items Matching a Rule
//https://leetcode.com/problems/count-items-matching-a-rule/description/
public class CountItemsMatchingRule {

	public static void main(String[] args) {
		
	}
	
	 public static int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
	        int index=0;
	        if(ruleKey.equals("color")){
	            index=1;
	        }
	        else if(ruleKey.equals("name")){
	            index=2;
	        }
	        int count=0;
	        for(List<String> item:items){
	            if(item.get(index).equals(ruleValue)){
	                count+=1;
	            }
	        }
	        return count;
	    }

}
