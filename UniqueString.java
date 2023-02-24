import java.util.Scanner;

public class UniqueString {

	public static void main(String[] args) {
		
		
		boolean res = true;
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter The Word  To Check All Unique Characters");
		String s1=scan.nextLine();
		
		for(int i = 0 ; i < s1.length()-1; i++)
		{
		for(int j = i+1; j < s1.length(); j++)
		{
		if(s1.charAt(i)==s1.charAt(j))
		{
		      res = false;
		    		  
		}
		
}
	}
		System.out.println(" String has all unique character: " + res);
		

	}

}
