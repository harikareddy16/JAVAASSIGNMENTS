package Question4;

import java.util.ArrayList;
import java.util.List;

public class Odd {
	public static void main(String[] args) {
		List<String> ls= new ArrayList<>();
		ls.add("harry");
		ls.add("likith");
		ls.add("akanksha");
		ls.add("kriti");
		ls.add("siddharth");
		ls.add("shehnaz");
		
		ls.forEach(i -> {  
            if (i.length() % 2 == 0) { //check for even length of string  
                System.out.println(i); 
		//ls.removeIf(n -> n%2!=0);//check for odd length of string
		//System.out.println(ls);
            }  
        });  
    }  
} 