package week1.day2;

public class IsPrime {

	public static void main(String[] args) {

		int num=7;
		int count=0;
		
		for(int i=2; i<num; i++) {
			if(num%i==0) {
				count++;
			}
		}
		if (count >1) {
			
				System.out.println("number is not a prime number :" +num);
			
			}
		else {
			System.out.println(" number  is prime number:" +num);
		}
	}

}
