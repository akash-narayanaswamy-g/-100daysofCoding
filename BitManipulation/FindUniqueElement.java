package BitManipulation;

//Q2. In an array every number appears twice and one number apears one,we have to find it?

public class FindUniqueElement {

		public static void main(String[] args) {
			int[] arr= {1,2,3,6,8,6,3,2,1};
			System.out.println(ans(arr));
		}
		public static int ans(int[] arr) {
			int unique=0;
			for(int i:arr) {
				unique^=i;
			}
			
			return unique;
		}
}
