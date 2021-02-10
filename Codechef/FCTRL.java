/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		InputStreamReader ir=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(ir);
		int n=Integer.parseInt(br.readLine());
		
		for (int i=0;i<n;i++)
		{   
		    int a=Integer.parseInt(br.readLine());
		    int ans=0;
		    for(int j=5;a/j>0;j=j*5)
		    {
		        ans=ans+a/j;
		    }
		  System.out.println(ans);  
		    
		   
		}
	}
}
