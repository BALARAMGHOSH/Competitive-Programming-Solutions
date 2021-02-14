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
        BufferedReader bu=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb=new StringBuilder();
        int t=Integer.parseInt(bu.readLine());
        while(t-->0)
        {
            String s[]=bu.readLine().split(" ");
            int n=Integer.parseInt(s[0]),m=Integer.parseInt(s[1]);
            int i,min[]=new int[n+1],max=n*(n+1)/2+n;
            for(i=1;i<=n;i++)
            min[i]=i+1+min[i/2]+min[i-1-i/2];
            if(m>max) sb.append(m-max+"\n");
            else if(m<=max && m>=min[n]) sb.append("0\n");
            else sb.append("-1\n");
        }
        System.out.print(sb);
    }
}
