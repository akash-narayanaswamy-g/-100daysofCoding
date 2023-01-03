package String_Problems;
//944. Delete Columns to Make Sorted
//https://leetcode.com/problems/delete-columns-to-make-sorted/description/

public class DeleteColumnsToMakeSorted {

	public static void main(String[] args) {
		String[] s= {"cba","daf","ghi"};
		System.out.println(minDeletionSize(s));

	}
	
	public static int minDeletionSize(String[] strs) {
		int delete=0;
        for (int i = 0; i < strs.length; i++) {
			for (int j = 0; j < strs[i].length(); j++) {
				if(strs[i].charAt(j)>strs[i].charAt(j+1)) {
					delete++;
					break;
				}
					
			}
		}
        return delete;
    }

}
