package String_Problems;
import java.util.*;

//2194. Cells in a Range on an Excel Sheet
//https://leetcode.com/problems/cells-in-a-range-on-an-excel-sheet/description/
public class CellsinaRangeonanExcelSheet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

	}
	
	public static List<String> cellsInRange(String s) {
        List<String> answerList = new ArrayList<>();
        int startLetter, startNumber, endLetter, endNumber;
        char[] charArray = s.toCharArray();
        startLetter = charArray[0];
        startNumber = Character.getNumericValue(charArray[1]);
        endLetter = charArray[3];
        endNumber = Character.getNumericValue(charArray[4]);
        for(int i = startLetter; i <= endLetter; i++) {
            String letter = String.valueOf((char) i);
            for (int j = startNumber; j <= endNumber; j++) {
                answerList.add(letter + j);
            }
        }
        return answerList;

}
}
