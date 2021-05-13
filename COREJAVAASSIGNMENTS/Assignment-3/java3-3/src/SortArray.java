

import java.util.ArrayList;
import java.util.ListIterator;

public class SortArray {
	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();
			al.add("harika");
			al.add("likith");
			al.add("sriya"); 
			al.add("kriti");
			al.add("akanksha");
			
			ListIterator<String> list=al.listIterator(al.size());  
			 while(list.hasPrevious())  
	         {  
	             String str=list.previous();  
	             System.out.println(str);  
	         }  
			
}
}
