
public class Pnagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String s1="THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG";
		boolean flag=false;
		
		s1=s1.replace(" ","");
		
		char [] ch=s1.toCharArray();
		
		int[] ar=new int [26]; 
		
		for(int i=0;i<ch.length;i++)
		{
			int index=ch[i]-65;
			ar[index]++;  
		}
		for(int i=0; i<ar.length;i++)
		{
			if(ar[i]==0)
			{
				System.out.println("It's not pangram");
				flag=true;
			}
		}
		if(flag==false)
		{
		System.out.println("It's pangram");
		}
		
	}

}
