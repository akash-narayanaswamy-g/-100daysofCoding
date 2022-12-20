package BitManipulation;

public class FindTerm {

	public static void main(String[] args) {
		int n=670;
		int ithTerm=5;
		System.out.println(ans(n,ithTerm));

	}
	public static int ans(int n,int i) {
		return (n<<i)&1;
	}


}
