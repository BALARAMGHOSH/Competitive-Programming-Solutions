import java.util.*;
import java.lang.*;
import java.io.*;
/**
 * trapRainWater
 */
public class trapRainWater {

    public static void main (String[] args)
	{
        FastReader scanner=new FastReader(); 
        int t=scanner.nextInt();
        while(t-->0){
            int n=scanner.nextInt();
            int[] a=new int[n];
            for (int i = 0; i < n; i++) {
                a[i]=scanner.nextInt();
            }
            System.out.println(maxWater(a,n));
        }

	}
	
	static class FastReader 
    { 
        BufferedReader br; 
        StringTokenizer st; 
  
        public FastReader() 
        { 
            br = new BufferedReader(new
                     InputStreamReader(System.in)); 
        } 
  
        String next() 
        { 
            while (st == null || !st.hasMoreElements()) 
            { 
                try
                { 
                    st = new StringTokenizer(br.readLine()); 
                } 
                catch (IOException  e) 
                { 
                    e.printStackTrace(); 
                } 
            } 
            return st.nextToken(); 
        } 
  
        int nextInt() 
        { 
            return Integer.parseInt(next()); 
        } 
  
        long nextLong() 
        { 
            return Long.parseLong(next()); 
        } 
  
        double nextDouble() 
        { 
            return Double.parseDouble(next()); 
        } 
  
        String nextLine() 
        { 
            String str = ""; 
            try
            { 
                str = br.readLine(); 
            } 
            catch (IOException e) 
            { 
                e.printStackTrace(); 
            } 
            return str; 
        } 
    } 
  
	 
	public static int maxWater(int[] height, int n)
    {
        Stack<Integer> stack = new Stack<>();
        int ans = 0;
 
        for (int i = 0; i < n; i++) {
 
            while ((!stack.isEmpty())
                   && (height[stack.peek()] < height[i])) {
 
                int pop_height = height[stack.peek()];
                stack.pop();
 
                if (stack.isEmpty())
                    break;
 
                int distance = i - stack.peek() - 1;
 
                int min_height
                    = Math.min(height[stack.peek()],
                               height[i])
                      - pop_height;
 
                ans += distance * min_height;
            }

            stack.push(i);
        }
 
        return ans;
    }
}