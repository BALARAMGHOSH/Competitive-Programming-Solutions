// { Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;
public class GfG
{
    public static void main(String args[])
        {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while(t-->0)
                {
                    int n;
                    n = sc.nextInt();
                    ArrayList<String> arr = new ArrayList<String>();
                    for(int i = 0;i<n;i++)
                        {
                            String p = sc.next();
                            arr.add(p);
                        }
                    String line = sc.next();
                    Sol obj = new Sol();  
                    System.out.println(obj.wordBreak(line,arr));  
                    
                }
        }
}// } Driver Code Ends


//User function Template for Java

class Sol
{
    public static int wordBreak(String s, ArrayList<String> wordDict )
    {
        boolean dp[]=new boolean[s.length()+1];
        dp[0]=true;
        for(int i=0;i<=s.length();i++){
            int j=i-1;
            while(j>=0){
              if(dp[j]&&wordDict.contains(s.substring(j,i))){
                  dp[i]=true;
                  break;
              }
              j--;    
            }
        }
        boolean b= dp[s.length()];
        if(b==true) return 1;
        else return 0;
    }
}
