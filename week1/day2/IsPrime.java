package week1.day2;

public class IsPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n=13;
		int count = 0;
		for (int i=1; i<=n; i++) {
			if (n%i==0) {
				count++;
			}
		}
		
		if (count==2) {
			System.out.println("It's a Prime Number");
		} else {
			System.out.println("Its not a Prime Number");
		}

	}

}
