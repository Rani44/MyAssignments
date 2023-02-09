package week1.day2;

public class Fibbinocci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num1 = 0;
		int num2 = 1;
		int num3;
		
		System.out.print(num1+" "+num2);
		for (int i=2; i<59; ++i) {
			num3 = num1 + num2;
			System.out.print(" "+num3);
			num1 = num2;
			num2 = num3;
		}
		
		

	}

}
