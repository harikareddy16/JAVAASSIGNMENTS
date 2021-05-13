import java.util.*;

class Parking{
	int floors;
	int section;
	int capacity;
	public LinkedHashMap<Integer, CarOwner> parkingSlot = new LinkedHashMap<Integer, CarOwner>();
	
	public Parking(int floors, int section, int capacity) {
		this.floors = floors;
		this.section = section;
		this.capacity = capacity;
	}

	public int getTotalCapacity(){
		return floors*section*capacity;
	}
	
	public void initMap(){
		for(int i=0;i<getTotalCapacity();i++){
			parkingSlot.put(i, null);
		}
	}
}

public class ParkedCarList {
	Parking parking;
	ParkedCarList(){
		parking = new Parking(3,4,20);
		parking.initMap();	
	}
	int addNewCar(CarOwner car){
		
		Set parkingSet = parking.parkingSlot.entrySet();
		Iterator itr = parkingSet.iterator();
		int token = 0;
		while(itr.hasNext()){
			
			Map.Entry slot = (Map.Entry)itr.next();
			if(slot.getValue()==null){
				
				parking.parkingSlot.put((Integer) slot.getKey(), car);
				token =  (int) slot.getKey();
				break;
			}
		}
		return token;
	}
	
	void removeCar(int token){
		parking.parkingSlot.put(token, null);
		int floor = Math.floorDiv(token, 80)+1;
		int section = Math.floorDiv(token, 20) % 4+1;
		System.out.println("Removed car from floor "+floor+", section "+section+".");
	}
	
	void getParkedLocation(int token){
		
		CarOwner owner = parking.parkingSlot.get(token);
		if(owner!=null){
			int floor = Math.floorDiv(token, 80)+1;
			int section = Math.floorDiv(token, 20) % 4+1;
			System.out.println("Hello "+owner.getName()+", your car is parked on floor "+floor
					+", section "+section+".");
		} else {
			System.out.println("Parking is empty");
		}
	}
	
	public static void main(String args[]){
		
		ParkedCarList carList = new ParkedCarList();
		Scanner scanner = new Scanner(System.in);
		int choice;
		while(true){
			System.out.println("-Car Parking-");
			System.out.println("1. Add Car");
			System.out.println("2. Show car location");
			System.out.println("3. Remove car");
			choice = scanner.nextInt();
			switch(choice){
			case 1:
				System.out.println("Enter your name");
				String name = scanner.next();
				String carModel = "Tesla s6";
				int carNo = 123;
				long mobileNo = 123;
				String address = "Vasant Vihar, Delhi";
				
				CarOwner car = new CarOwner(name, carModel, carNo, mobileNo, address);
				int token = carList.addNewCar(car);
				System.out.println("Car is parked, your token is : "+token);
				System.out.println("Thankyou");
				break;
			case 2:
				System.out.println("Please provide your token");
				int userToken = scanner.nextInt();
				carList.getParkedLocation(userToken);
				break;
			case 3:
				System.out.println("Please provide your token");
				int userToken1 = scanner.nextInt();
				carList.removeCar(userToken1);
				break;
			default:
				System.exit(0);
			}
			
		}
		
		
	}
}
[10:38, 13/05/2021] Dinesh Cap: public class CarOwner {
	String name;
	String carModel;
	int carNo;
	long mobileNo;
	String address;
	public CarOwner(String name, String carModel, int carNo, long mobileNo, String address) {
		super();
		this.name = name;
		this.carModel = carModel;
		this.carNo = carNo;
		this.mobileNo = mobileNo;
		this.address = address;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCarModel() {
		return carModel;
	}
	public void setCarModel(String carModel) {
		this.carModel = carModel;
	}
	public int getCarNo() {
		return carNo;
	}
	public void setCarNo(int carNo) {
		this.carNo = carNo;
	}
	public long getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(long mobileNo) {
		this.mobileNo = mobileNo;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}