package Collection_framework;
//Day 8: Dictionaries and Maps
//https://www.hackerrank.com/challenges/30-dictionaries-and-maps/problem
import java.util.*;

class Solution{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        Map<String,Integer> obj=new HashMap<>();
        int n = in.nextInt();
        for(int i = 0; i < n; i++){
            String name = in.next();
            int phone = in.nextInt();
            obj.put(name, phone);
        }
        while(in.hasNext()){
            String s = in.next();
            if(obj.containsKey(s))
                System.out.println(s+"="+obj.get(s));
            else
                System.out.println("Not found");
        }
        in.close();
    }
}
public class PhoneBook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
