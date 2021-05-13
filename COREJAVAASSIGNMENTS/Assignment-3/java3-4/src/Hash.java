

import java.util.HashSet;
import java.util.LinkedHashSet;
public class Hash {

	public static void main(String[] args) {

		HashSet<String> n=new HashSet<>();
		n.add("hello");
		n.add("hii");
		n.add("heyy");
		n.add("hang");
		
		System.out.println("Unorderd "+n);
		
		LinkedHashSet<String> ln=new LinkedHashSet<String>();
		ln.add("hello");
		ln.add("hii");
		ln.add("heyy");
		ln.add("hang");		
		System.out.println("Orderd "+ln);
		
	}

}
