package Collection_framework;

import java.util.*;

public class SetInterface {

	public static void main(String[] args) {
		Set<Integer> obj=new HashSet<>();
		System.out.println(obj.add(1));
		System.out.println(obj.add(1));
		System.out.println(obj.add(2));
		System.out.println(obj.add(6));
		System.out.println(obj.add(166));
		System.out.println(obj.add(13));
		System.out.println(obj.add(13));
		
		System.out.println(obj);
		
		//gives ascending order
		Set<Integer> obj2=new TreeSet<>();
		System.out.println(obj2.add(1));
		System.out.println(obj2.add(1));
		System.out.println(obj2.add(2));
		System.out.println(obj2.add(6));
		System.out.println(obj2.add(166));
		System.out.println(obj2.add(13));
		System.out.println(obj2.add(13));
		
		System.out.println(obj2);
	}

}
