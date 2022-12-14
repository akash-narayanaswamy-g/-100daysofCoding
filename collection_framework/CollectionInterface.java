package Collection_framework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionInterface {
	public static void main(String[] args) {
				
		List v=new ArrayList();
		v.add(55);
		v.add(5);
		Collections.sort(v);
		
		v.forEach(System.out::println);// stream api lambda expression

	}

}
