


import java.util.Comparator;
import java.util.TreeSet;

 class Bank {

	int ID;
	int Balance;
	String Name;
	String Salary;

	Bank(int iD, int balance, String name, String salary) {
		super();
		ID = iD;
		Balance = balance;
		Name = name;
		Salary = salary;
	}

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public int getBalance() {
		return Balance;
	}

	public void setBalance(int balance) {
		Balance = balance;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getSalary() {
		return Salary;
	}

	public void setSalary(String salary) {
		Salary = salary;
	}

	@Override
	public String toString() {
		return "Bank [ID=" + ID + ", Balance=" + Balance + ", Name=" + Name + ", Salary=" + Salary + "]";
	}

	void WithDraw() {
	}
 void Deposit() {

	}

}

class Bankacc {

	public static void main(String[] args) {

		Bank a1 = new Bank(1999, 103, "harika", "Salray");

		Bank a2 = new Bank(1998, 101, "likith", "Salray");

		Bank a3 = new Bank(1997, 101, "kriti", "Salray");

		Bank a4 = new Bank(1996, 104, "aku", "Salray");

		TreeSet<Bank> n= new TreeSet<>(new MyComparator());

		n.add(a1);
		n.add(a2);
		n.add(a3);
		n.add(a4);

		System.out.println(n);

	}

}

class MyComparator implements Comparator
{
	@Override
	public int compare(Object o1, Object o2) {
		Integer i1 = (Integer) o1;
		Integer i2 = (Integer) o2;

		if (i1 > i2) {

			return -1;
		} 
		else if (i1 < i2) {
			return 1;

		} else if (i1 == i2) {

		}
		return i1;
	}
}
















