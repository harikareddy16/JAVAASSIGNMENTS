

import java.util.TreeSet;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		 TreeSet<Height> ts = new TreeSet<>();
		 ts.add(new Height(700,78,"Harika"));
		 ts.add(new Height(900,87,"likith"));
		 ts.add(new Height(568,98,"kriti"));
		 ts.add(new Height(456,65,"akanksha"));
		 ts.add(new Height(543,97,"sreeja"));
		 
		 for(Height element : ts)
			 System.out.println(element);
		 
	}

}

