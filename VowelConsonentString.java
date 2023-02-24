
public class VowelConsonentString {

	public static void main(String[] args) {
		
		String s1="INEURON@#$GH";
		char ch[]=s1.toCharArray();
		int vcount=0,count=0,scount=0;
		
		for (int i = 0; i <s1.length(); i++) 
		{
		        if (s1.charAt(i)=='A' || s1.charAt(i)=='E' || s1.charAt(i)=='I' || s1.charAt(i)=='O' || s1.charAt(i)=='U' ) 
		        {
		         vcount++;
		        }
		        else if(s1.charAt(i)>'A'  && s1.charAt(i)<'z') {
		        	count++;
		        }
		        else {
		        	scount++;
		        }
		
	}
		System.out.println("Original String character present in:" +s1);
		System.out.println();
		System.out.println("Vowel character present in:"+ vcount++);
		System.out.println();
		System.out.println("Consonent character present in:"+ count++);
		System.out.println();
		System.out.println("Special character present in:"+ scount++);
}
}
