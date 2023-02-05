package BitManipulation;

//Set the rightmost unset bit
//https://practice.geeksforgeeks.org/problems/set-the-rightmost-unset-bit4436/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=Set+the+rightmost+unset+bit

public class SetTheRightmostUnsetbit {

	public static void main(String[] args) {
		int N = 6;
		System.out.println(setBit(N));
	}
	
	static int setBit(int n){
        if((n&(n+1))==0)
            return n;
        return n|(n+1);
    }

}
