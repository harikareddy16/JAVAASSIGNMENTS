package Question6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class UpperLower {

	public static void main(String[] args) {
		List<String> ls= new ArrayList<>(Arrays.asList("q","r","s","t","harry","liki"));
		System.out.println(ls);
		
		List<String> s= new ArrayList<>(); //another method to add the values into arraylist
		s.add("Hello");
		System.out.println(s);
		
		
		ls.replaceAll(n -> n.toLowerCase()); //to change to Lower case
		System.out.println(ls);
		
		ls.replaceAll(n -> n.toUpperCase()); //to change to Upper case
		System.out.println(ls);
	

	}

}
