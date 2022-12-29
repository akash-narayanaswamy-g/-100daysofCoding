package String_Problems;

public class StringSearch {

	public static void main(String[] args) {
		String name="akashn";
		char target='n';
		System.out.println(StringLinearsearch(name, target));
	}
	
	static boolean StringLinearsearch(String name,char target) {
		for (char n : name.toCharArray()) {
			if(n==target)
				return true;
		}
		return false;
	}

}
