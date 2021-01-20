import java.io.*;
import java.util.*;
import java.util.Map.Entry;
 
class TADELIVE {
	
	public static void main(String[] agrs) {
		FastScanner sc = new FastScanner();
		
		int n = sc.nextInt();
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		int[] a = sc.readArray(n);
		int[] b = sc.readArray(n);
		
		ArrayList<int[]> al = new ArrayList<>();
		for(int i = 0; i < n; i++) {
			al.add(new int[] {a[i],b[i]});
		}
		
		Collections.sort(al, (X,Y) -> Math.abs(Y[0]-Y[1]) - Math.abs(X[0]-X[1]));
		
		long profit = 0;
		for(int i = 0; i < n; i++) {
			int[] t = al.get(i);
			if(t[0]>t[1]) {
				if(x > 0) {
					profit += t[0]; 
					x--;
				}
				else {
					profit += t[1]; 
					y--;
				}
			}
			else {
				if(y > 0) {
					profit += t[1]; 
					y--;
				}
				else {
					profit += t[0];
					x--;
				}
			}
		}
		System.out.println(profit);
	}




	


	static int mod = 1000000007;
	static long pow(int a, int b) {
		if(b == 0) {
			return 1;
		}
		if(b == 1) {
			return a;
		}
		if(b%2 == 0) {
			long ans = pow(a,b/2);
			return ans*ans;
		}
		else {
			long ans = pow(a,(b-1)/2);
			return a * ans * ans;
		}
		
	}
	
	static class FastScanner {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer("");
		String next() {
			while (!st.hasMoreTokens())
				try {
					st=new StringTokenizer(br.readLine());
				} catch (IOException e) {
					e.printStackTrace();
				}
			return st.nextToken();
		}
		
		int nextInt() {
			return Integer.parseInt(next());
		}
		int[] readArray(int n) {
			int[] a=new int[n];
			for (int i=0; i<n; i++) a[i]=nextInt();
			return a;
		}
		long nextLong() {
			return Long.parseLong(next());
		}
	}
 
}
