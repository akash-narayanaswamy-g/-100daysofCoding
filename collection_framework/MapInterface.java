package Collection_framework;

import java.util.*;

public class MapInterface {

	public static void main(String[] args) {
		Map<String,String> map=new HashMap<>();
		map.put("name","akash");
		map.put("c","good");
		map.put("ww","ee");
		map.put("lo","ve");
		
		System.out.println(map.get("name"));
		
		//gives the keys of the map interface
		Set<String> key=map.keySet();
		for(String k:key) {
			System.out.println(k);
		}

	}

}
