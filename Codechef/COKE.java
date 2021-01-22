import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.Arrays;

/* Name of the class has to be "Main" only if the class is public. */
 class COKE
{
	public static void main (String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int tcase=sc.nextInt();
		while(tcase-->0)
		{
		    int N=sc.nextInt();
		    int M=sc.nextInt();
		    int K=sc.nextInt();
		    int L=sc.nextInt();
		    int R=sc.nextInt();
		    long minPrice=10000000;
		    int flag=0;
		    while(N-->0)
		    {
		        long t=sc.nextLong();
		        long price=sc.nextLong();
		        for(int i=1;i<=M;i++)
		        {
		            if(t>=K-1 && t<=K+1)
		                t=K;
		            else if(t>K+1)
		                t-=1;
		            else if(t<K-1)
		                t+=1;
		         }
		         if(t>=L && t<=R)
		         {
		             minPrice=Math.min(minPrice,price);
		             flag=1;
		         }
		    }
		    if(flag==0)
		        System.out.println("-1");
		    else
		        System.out.println(minPrice);
		}
	}
}

	
	

