/* package codechef; // don't place package name! */
import java.math.BigInteger;
import java.util.*;
import java.lang.*;
import java.io.*;
import java.io.DataInputStream; 
import java.io.FileInputStream; 
import java.io.IOException; 
import java.io.InputStreamReader; 
import java.util.Scanner; 
import java.util.StringTokenizer; 

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
    static class Reader 
    { 
        final private int BUFFER_SIZE = 1 << 16; 
        private DataInputStream din; 
        private byte[] buffer; 
        private int bufferPointer, bytesRead; 
  
        public Reader() 
        { 
            din = new DataInputStream(System.in); 
            buffer = new byte[BUFFER_SIZE]; 
            bufferPointer = bytesRead = 0; 
        } 
  
        public Reader(String file_name) throws IOException 
        { 
            din = new DataInputStream(new FileInputStream(file_name)); 
            buffer = new byte[BUFFER_SIZE]; 
            bufferPointer = bytesRead = 0; 
        } 
  
        public String readLine() throws IOException 
        { 
            byte[] buf = new byte[64]; // line length 
            int cnt = 0, c; 
            while ((c = read()) != -1) 
            { 
                if (c == '\n') 
                    break; 
                buf[cnt++] = (byte) c; 
            } 
            return new String(buf, 0, cnt); 
        } 
  
        public int nextInt() throws IOException 
        { 
            int ret = 0; 
            byte c = read(); 
            while (c <= ' ') 
                c = read(); 
            boolean neg = (c == '-'); 
            if (neg) 
                c = read(); 
            do
            { 
                ret = ret * 10 + c - '0'; 
            }  while ((c = read()) >= '0' && c <= '9'); 
  
            if (neg) 
                return -ret; 
            return ret; 
        } 
  
        public long nextLong() throws IOException 
        { 
            long ret = 0; 
            byte c = read(); 
            while (c <= ' ') 
                c = read(); 
            boolean neg = (c == '-'); 
            if (neg) 
                c = read(); 
            do { 
                ret = ret * 10 + c - '0'; 
            } 
            while ((c = read()) >= '0' && c <= '9'); 
            if (neg) 
                return -ret; 
            return ret; 
        } 
  
        public double nextDouble() throws IOException 
        { 
            double ret = 0, div = 1; 
            byte c = read(); 
            while (c <= ' ') 
                c = read(); 
            boolean neg = (c == '-'); 
            if (neg) 
                c = read(); 
  
            do { 
                ret = ret * 10 + c - '0'; 
            } 
            while ((c = read()) >= '0' && c <= '9'); 
  
            if (c == '.') 
            { 
                while ((c = read()) >= '0' && c <= '9') 
                { 
                    ret += (c - '0') / (div *= 10); 
                } 
            } 
  
            if (neg) 
                return -ret; 
            return ret; 
        } 
  
        private void fillBuffer() throws IOException 
        { 
            bytesRead = din.read(buffer, bufferPointer = 0, BUFFER_SIZE); 
            if (bytesRead == -1) 
                buffer[0] = -1; 
        } 
  
        private byte read() throws IOException 
        { 
            if (bufferPointer == bytesRead) 
                fillBuffer(); 
            return buffer[bufferPointer++]; 
        } 
  
        public void close() throws IOException 
        { 
            if (din == null) 
                return; 
            din.close(); 
        } 
    } 
/*----------------------------------------------------------------------------------------------
    public static long mod=1000000007;
    public static long power(long a, long b)	{
	if(b == 0)
		return 1;
	long answer = power(a, b/2)%mod;
	answer = (answer*answer)%mod;
	if(b%2!=0)
		answer = (answer*a)%mod;
	return answer;
}
public static long min(long a, long b)	{
	return a<b?a:b;
}
public static long divide(long a,long b)	{
	return (a%mod*(power(b, mod-2)%mod))%mod;
}
 
public static long nCr(long n,long r)	{
	long answer = 1;
	long k = min(r, n-r);
	for(long i=0;i<k;i++)	{
		answer = (answer%mod*(n-i)%mod)%mod;
		answer = divide(answer, i+1);
	}
	return answer%mod;
}

public static boolean plaindrome(String str){
    StringBuilder sb=new StringBuilder();
    sb.append(str);
    return (str.equals((sb.reverse()).toString()));
}
----------------------------------------------------------------------------------------------*/
  public static class Input implements Comparable<Input> {
        int a, b;

        public Input(int a, int b) {
            this.a = a;
            this.b = b;
        }

        public int compareTo(Input o) {
            return this.b - o.b;
        }
    }
  
	public static void main (String[] args) throws java.lang.Exception
	{
		Reader sc=new Reader(); 
		StringBuilder sb=new StringBuilder();
	int tc=sc.nextInt();
	while(tc-->0){
	    int N=sc.nextInt();
	    
            List<Input> arr = new ArrayList<>();
            for (int x = 0; x < N; x++)
                arr.add(new Input(sc.nextInt(), sc.nextInt()));
            Collections.sort(arr);

            int arrowsSum = 0;
            while (!arr.isEmpty()) {
                Input temp = arr.get(0);
                arrowsSum++;
                arr.removeIf(s -> s.a <= temp.b && s.b >= temp.b);
            }
            System.out.println(arrowsSum);
	    
	}
		
	}
}
