package BitManipulation;

//https://practice.geeksforgeeks.org/problems/bit-manipulation-1666686020/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=bit-manipulation


public class GetSetClear {

	public static void main(String[] args) {
		bitManipulation(70, 3);

	}
	
	static void bitManipulation(int n, int i) {
        int k=(1<<(i))-i;
        System.out.print(((n&(1<<i-1))>>i-1)+" ");
        System.out.print((n|(1<<i-1))+" ");
        System.out.print((n&~(1<<i-1)));
    }

}
