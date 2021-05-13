

import java.util.Iterator;  
import java.util.LinkedHashSet;  
  
public class Linked {   
	
     public static void main(String args[]){ 
    	 
            LinkedHashSet<String> lh=new LinkedHashSet();    
                   lh.add("iphone");    
                   lh.add("samsung");      
                   lh.add("microsoft");
                   lh.add("nokia");
                   lh.add("redmi");    
                   lh.add("vivo");  
                   lh.add("oppo");
                   
                   Iterator<String> i=lh.iterator(); 
                   
                   while(i.hasNext())  
                   {    
                   System.out.println(i.next());     
                   }    
     }    
    }   
