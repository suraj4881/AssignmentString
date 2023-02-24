
public class DuplicateStringRemove {

	public static void main(String[] args) {
		
		
		
		String s1="abcdbcd";
		
		StringBuilder sb = new StringBuilder();
		
		
		char ch[]=s1.toCharArray();
		
		boolean flag;
		
		
		for (int i = 0; i < ch.length; i++) 
		{
			flag =false;
		    
		    for (int j = i+1; j <ch.length; j++)
		    {
		        if (ch[i]==ch[j]) 
		        {
		            flag = true;
		            break;
		        }
		    }
		    
		    if (!flag)
		    {
		    	sb.append(ch[i]);
		       
		    }
		
		
		}
		System.out.println("Original String:"+s1);
		System.out.println();
		 System.out.println("Remove Duplicate String:"+sb);
      }    
	}


