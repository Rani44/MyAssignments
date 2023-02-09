package week1.day2;

public class Car {
	
	int number = 5555;
	boolean punctured = false;
	int num1 = 100;
	int num2 = 10;
	int num3 = 2;
	
	
	public int getRegistrationNo() {
		return number;
	}
	
	private String getOwnerName() {
		String name = "Anne";
		return name;
	}
	
	public void carModel() {
		System.out.println("Car Model name is Honda City");
	}
	
	public boolean isPunctured() {
		return punctured;
		
	}
	
	public int subTwoNumbers() {
		return (num1 - num2);
	}

	public int multipleThreeNumbers() {
		return (num1*num2*num3);
	}
	
	public int divideTwoNumbers() {
		return (num1 / num2);
	}
	public static void main(String[] args) {
		
		Car c = new Car();
		System.out.println(c.getRegistrationNo());
		System.out.println(c.getOwnerName());
		c.carModel();
		System.out.println(c.isPunctured());
		System.out.println(c.subTwoNumbers());
		System.out.println(c.multipleThreeNumbers());
		System.out.println(c.divideTwoNumbers());
		
		
		
		// TODO Auto-generated method stub
		
	/*	public -> get Registration Number (4 digits)
		private -> get Owner's Name
		package -> print the car model (Swift, Duster, City)
		public -> Is punctured?
		public -> subtracting two numbers
		public -> Multiplying 3 numbers
		public -> dividing 2 numbers */
		
		
		

	}

}
