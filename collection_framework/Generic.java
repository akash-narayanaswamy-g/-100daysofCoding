package Collection_framework;

import java.util.*;

public class Generic {

	public static void main(String[] args) {
		
		//collection without generics		
		List v=new ArrayList();
		v.add(55);
		v.add("akash");
		System.out.println(v);
		
		//collection with generics
		List<Integer> m=new ArrayList<>();
		m.add(88);
		m.add(99);
		System.out.println(m.get(0));

	}

}
