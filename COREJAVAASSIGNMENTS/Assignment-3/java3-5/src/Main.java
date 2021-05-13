

//import java.util.HashMap;
//import java.util.Iterator;
//import java.util.Map;
//import java.util.Set;
import java.util.Map.Entry;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		Employeee e1=new Employeee(1009,"hloo",30000,"hloo@ok.com");
		Employeee e2=new Employeee(1020,"hii",50000,"hii@ok.com");
		Employeee e3=new Employeee(1005,"heyy",20000,"heyy@ok.com");
		Employeee e4=new Employeee(1010,"hang",80000,"hang@ok.com");
		
		Department d1 = new Department(10001,"CSE","hyderabad");
		Department d2 = new Department(10003,"ECE","banglore"); 
		
		Map<Employeee,Department> empDeptMap = new HashMap<>();
		empDeptMap.put(e1, d1);
		empDeptMap.put(e2, d2);
		empDeptMap.put(e3, d1);
		empDeptMap.put(e4, d2);
		
		Set<Entry<Employeee,Department>> entrySet = empDeptMap.entrySet();
		Iterator<Entry<Employeee,Department>>iterator= entrySet.iterator();
		
		for(Entry<Employeee,Department> entry:entrySet) {
			Employeee employee = entry.getKey();
			Department department = entry.getValue();
			
			System.out.println(employee);
			System.out.println(department);
			
		}
		
		
		
	}

}
