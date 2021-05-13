
import java.util.HashSet;  
import java.util.Iterator; 

public class Hash{
	
     public static void main(String args[]){   
    	 
        HashSet<String> h=new HashSet();    
        
               h.add("iphone");     
               h.add("samsung");      
               h.add("microsoft");     
               h.add("nokia");    
               h.add("redmi"); 
               h.add("vivo");
               
               Iterator<String> i=h.iterator();    
               
               while(i.hasNext())    
               {    
               System.out.println(i.next());    
               }    
     }    
}  
