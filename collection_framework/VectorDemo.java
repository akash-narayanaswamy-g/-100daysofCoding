package Collection_framework;

import java.util.Vector;

public class VectorDemo {

	public static void main(String[] args) {
		Vector v=new Vector<>();
		v.add(55);
		v.add(55);
		v.add(55);
		v.add(55);
		v.add(55);
		System.out.println(v.capacity());
		
		v.forEach(System.out::println);

	}

}
