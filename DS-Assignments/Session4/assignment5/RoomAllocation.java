package assignment5;

public class RoomAllocation {
	

	MyHashTable<Integer, Customer> roomMapping;
	
	/**
	 * Constructor for {@link RoomAllocation}
	 */
	public RoomAllocation() {
		roomMapping = new MyHashTable<Integer, Customer>();
	}
	
	/**
	 * Allocating the Rooms to customer 
	 * @param scan is Scanner object to take input
	 * @param room is {@link RoomAllocation} object 
	 */
	public void insertCust(Scanner scan , RoomAllocation room){
		System.out.println("Enter your name");
		String name = scan.nextLine();
		System.out.println("Enter your age");
		int age = scan.nextInt();
		scan.nextLine();
		Customer cust = new Customer(name, age);
		room.roomMapping.insertcustInfo(age, cust);
	}
	
	/**
	 * Getting information of the Customers
	 * @param scan is Scanner object to take input
	 * @param room is {@link RoomAllocation} object
	 */
	public void getCustInfo(Scanner scan , RoomAllocation room){
		System.out.println("Enter the Customer age");
		int age = scan.nextInt();
		scan.nextLine();
		Customer cust = room.roomMapping.getValue(age);
		System.out.println("Customer Name : "+cust.getCustName());
		System.out.println("Customer Age : "+cust.getCustAge());
	}
	
	public static void main(String [] ar){
		System.out.println("Welcome to Ajinkya's Guest House");
		RoomAllocation room = new RoomAllocation();
		Scanner scan = new Scanner(System.in);
		do{
			System.out.println("Enter your choice");
			System.out.println("1: Insert Customer");
			System.out.println("2: Get Customer Info");
			System.out.println("3: exit");
			int choice =  scan.nextInt();
			scan.nextLine();
			if(choice == 1){
				room.insertCust(scan, room);
			}else if(choice == 2){
				room.getCustInfo(scan, room);
			}else if(choice == 3){
				break;
			}else{
				System.out.println("\nEnter Correct Choice\n");
			}
		}while(true);
	}
}
