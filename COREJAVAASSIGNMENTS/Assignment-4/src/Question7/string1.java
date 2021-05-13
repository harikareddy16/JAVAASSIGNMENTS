package Question7;

import java.util.HashMap;
import java.util.Map;

public class string1 {

	public static void main(String[] args) {
		Map<String,Integer> m = new HashMap<>();
		m.put("hello", 1);
		m.put("hiii",2);
		m.put("heyyy",3);
		
		StringBuilder s = new StringBuilder();
		m.entrySet().forEach(n -> s.append(n.getKey()).append(n.getValue()));
		System.out.println(s.toString());
		
	}

}
