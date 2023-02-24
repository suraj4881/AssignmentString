
public class DuplicateString {
	public static void main(String[] args) {
		
		String s1="abcdbcd";
		String s2="";
		
        char ch[]=s1.toCharArray();
        
        
		for (int i = 0; i < ch.length; i++) 
		{
			
		    
		    for (int j = i+1; j <ch.length; j++)
		    {
		        if (ch[i]==ch[j]) 
		        {
		          s2=s2+ ch[i];
		         
		        }
		    }
		    
		}
		
		System.out.println("Original string is:"+s1+"!");
        System.out.println();
		System.out.print("Duplicate string is:"+s2+"!");
		
}	
}

