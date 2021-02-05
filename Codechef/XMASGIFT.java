import java.util.*;
import java.lang.*;
import java.io.*;

public class XMASGIFT
{
    
    public static void main (String[] args) throws java.lang.Exception
	{
		try{
            BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
            PrintWriter ot=new PrintWriter(System.out);
            int t=Integer.parseInt(br.readLine().trim());
            while(t-->0)
            {
                String s[]=br.readLine().trim().split(" ");
                long n=Long.parseLong(s[0]);
                long m=Long.parseLong(s[1]);
                long a=Long.parseLong(s[2]);
                long d=Long.parseLong(s[3]);
                long count=0;
                for(int i=0;i<=4;i++)
                {
                    if(check(i,a,d))
                    {
                        count+=countDivisibles(n, m, a+i*d);
                        for(int j=0;j<i;j++)
                        {
                            if(check(j,a,d))
                            count-=countDivisibles(n, m, lcm(a+i*d,a+j*d));
                        }
                    }
                }
                
                ot.println(m-n+1-count);
                

            }   
            ot.close();
            br.close();
            
        } catch(Exception e){
            e.printStackTrace();
            return;
        }
    }
    static long gcd(long a, long b)
    {
        if (a == 0)
            return b; 
        return gcd(b % a, a); 
    }
     
    static long lcm(long a, long b)
    {
        return (a / gcd(a, b)) * b;
    }
    public static boolean check(long i,long a,long d){
        long temp=a+i*d;
        for(long k=0;k<i;k++)
        {
            if(temp%(a+k*d)==0)
            return false;
        }
        return true;
    }
    static long countDivisibles(long A, long B, long M) 
    { 
        if (A % M == 0) 
            return (B / M) - (A / M) + 1; 
  
        return (B / M) - (A / M); 
    } 
}
    