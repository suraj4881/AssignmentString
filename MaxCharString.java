
public class MaxCharString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1="abcdbcdcfefea";
		
		int[] count = new int[s1.length()];
		
		char ch[]=s1.toCharArray();
		
		 char maxch =s1.charAt(0);
		 
		 int max;
		
		for (int i = 0; i <ch.length; i++) 
		{
			for (int j = i+1; j <ch.length; j++)
		    {
		        if (ch[i]==ch[j]  &&ch[i] != ' ' && ch[i] != '0') 
		        {  
		        	
		        	count[i]++;
		        	ch[j]='0';
		        
		        }
		    }  
		        
	}    
		
		
		
		   max = count[0];  
        for(int i = 0; i <count.length; i++) {  
            
            if(max < count[i]) {  
                max = count[i];  
                maxch = ch[i];  
            }  
        }  
		
		System.out.println("Maximum character present in:" +maxch  );
			
}
}
