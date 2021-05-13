package assignmnt5;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.*;

public class FruitMain {

	public static void main(String[] args) {
		ArrayList<Fruit> al = new ArrayList<>();
		al.add(new Fruit("apple", 90, 50, "Red"));
		al.add(new Fruit("Banana", 200, 10, "white"));
		al.add(new Fruit("watermelon", 200, 70, "Red"));
		al.add(new Fruit("strawberry", 300, 150, "Red"));
		al.add(new Fruit("kiwi", 30, 20, "Red"));
		
		
		//Fruit f1 = new Fruit ("apple",500,100,"red");// we can add by this method too
		//System.out.println(f1);
		for(Fruit name:al)    
		    System.out.println(name);
		
		//1.Display  the  fruit  names  of  low  caloriesfruits i.e.  calories  <  100  sorted  in descending order of calories.	
		System.out.println("Acoording to <less calories ");
		al.stream()
		.filter(t->(t.getcalories()<100))
		.collect(Collectors.toList())
		.forEach(t->System.out.println(t));
		
		//2.Display colorwise list of fruit names.
		System.out.println("\nSort according to color");
		al.stream()
		.sorted((p1,p2)->p1.color.compareTo(p2.color))
		.forEach(System.out::println);
		
		//3.Display only RED color fruits sorted as per their price in ascending order.
		System.out.println("\nSort Red color fruits sorted withprice in ascending");
		al.stream()
		.filter(t->t.color.equals("Red"))
		.forEach(t->System.out.println(t));
		
	}

}