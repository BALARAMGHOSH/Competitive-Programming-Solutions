/* Code by Balaram Ghosh */

import java.io.*;
import java.util.*;
import java.lang.*;

class SEAVOTE 
{ 

        public static void main(String[] args) throws IOException 
    { 
        Scanner s=new Scanner(System.in); 
        int t = s.nextInt(); 
        while (t-- > 0) 
        { 
            int n=s.nextInt();
		    int sum=0;
		    int z=0;
		    int arr[]=new int[n];
		    for(int i=0;i<n;i++){
		        
		        arr[i]=s.nextInt();
		        if(arr[i]!=0)z++;
		        sum+=arr[i];
		    }
		    if(sum<100)
		   	    {
		   	        System.out.println("NO");
		   	    }
		   else	if(sum==100||sum-100<z)
		   	{
		   	    System.out.println("YES");
		   	}
		   	else{
		   	      System.out.println("NO");
		   	} 	
        } 
    } 
} 
/* Code by Balaram Ghosh */

