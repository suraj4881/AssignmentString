import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the Word &&& Number to Check Palindrome");
		String s3=scan.nextLine();
		String s4="";
		
		for(int i=s3.length()-1;i>=0;i--) {
			
			s4=s4 + s3.charAt(i);
			
		}
		
		if(s3.equals(s4)) 
		{
			System.out.println("It is Palindrome");
			
		}
		
		else {
			
			System.out.println("It is not Palindrome");
		}
		
		
	}

}
