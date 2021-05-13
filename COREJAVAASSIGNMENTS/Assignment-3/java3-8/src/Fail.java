

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Fail {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    HashSet<Object> n=new HashSet();
		
		n.add("harika");
		n.add("kriti");
		n.add(21);
		n.add(6);

		Iterator i=n.iterator();
		 while(i.hasNext())
		   {
			   
			   Object a=i.next();
			   n.add("likith");
			   System.out.println(a); 
		   }
	}
}
