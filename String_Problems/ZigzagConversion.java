package String_Problems;

public class ZigzagConversion {

	public static void main(String[] args) {
		String s = "PAYPALISHIRING";int numRows = 3;
		System.out.println(convert(s, numRows));

	}
	
	 public static String convert(String s, int numRows) {
	        if (numRows == 1) {
	            return s;
	        }
	        
	        StringBuilder answer = new StringBuilder();
	        int n = s.length();
	        int charsInSection = 2 * (numRows - 1);
	        
	        for (int i = 0; i < numRows; ++i) {
	            int index = i;

	            while (index < n) {
	                answer.append(s.charAt(index));

	                if (i != 0 && i != numRows - 1) {
	                    int charsInBetween = charsInSection - 2 * i;
	                    int secondIndex = index + charsInBetween;
	                    
	                    if (secondIndex < n) {
	                        answer.append(s.charAt(secondIndex));
	                    }
	                }
	                index += charsInSection;
	            }
	        }
	        
	        return answer.toString();
	    }

}
