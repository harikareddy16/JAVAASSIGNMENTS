package assignmnt5;


public class Fruit {
	String name; 
	int calories; 
	int price; 
	String color;

	public Fruit(String name,int calories,int price,String color)
	{
		super();
		this.name = name;
		this.calories = calories;
		this.price = price;
		this.color = color;
	}
	public String getname(){
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getcalories(){
		return calories;
	}
	public void setCalories(int calories) {
		this.calories = calories;
	}
	public int getprice(){
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getcolor(){
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}


	public String toString()
    {
    	return "Fruit: " + name + ", Calories:"+calories+", Price: "+price+", Color:"+color;
    }
	 
}
