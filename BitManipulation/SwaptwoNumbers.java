package BitManipulation;
import java.util.*;

//Swap two numbers
//https://practice.geeksforgeeks.org/problems/swap-two-numbers3844/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=Swap+two+numbers

public class SwaptwoNumbers {

	public static void main(String[] args) {
		int a = 13, b = 9;
		System.out.println(get(a, b));
	}
	
	static List<Integer> get(int a,int b)
    {
        List<Integer>l=new ArrayList<>();
        a^=b;
        b^=a;
        a^=b;
        l.add(a);
         l.add(b);
        return l;
    }

}
