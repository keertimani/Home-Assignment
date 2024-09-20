package week1.day2;

public class PalindromeOrNot {

	public static void main(String[] args) {

int num = 1234;
		int temp = num;
		int rev= 0;
		
		while(num!=0)
		{
			rev= rev*10+ num%10;
			num= num/10;
			
		}
		
		if (temp==rev) {
			System.out.println("number is palindrome:" +temp);
		}
		else {
			System.out.println(" number is not palindrome:" +temp);
		}
	}

}
		
	


