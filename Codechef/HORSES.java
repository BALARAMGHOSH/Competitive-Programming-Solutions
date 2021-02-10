import java.util.*;
import java.io.*;
public class Main {
    static FastReader fs = new FastReader();
    public static void main(String[] args){
        int t=fs.nextInt();
        //t=1;
        while(t-->0){
            solve();
        }
    }
    public static void solve(){
        int n=fs.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++)arr[i]=fs.nextInt();
        int min=1000000001;
        Arrays.sort(arr);
        for(int i=0;i<n-1;i++){
            min=Math.min(min,arr[i+1]-arr[i]);
        }
        System.out.println(min);

    }
}

class FastReader{
    BufferedReader br;
    StringTokenizer st;

    public FastReader() {
        br=new BufferedReader(new InputStreamReader(System.in));
    }

    String next() {
        while(st==null || !st.hasMoreElements()) {
            try {
                st=new StringTokenizer(br.readLine());
            }
            catch(IOException e) {
                e.printStackTrace();
            }
        }
        return st.nextToken();
    }

    int nextInt() {
        return Integer.parseInt(next());
    }

    long nextLong() {
        return Long.parseLong(next());
    }

    double nextDouble() {
        return Double.parseDouble(next());
    }

    String nextLine() {
        String str="";
        try {
            str=br.readLine();
        }
        catch(IOException e) {
            e.printStackTrace();
        }
        return str;

    }
    int[] readArray(int n) {
        int[]  arr = new int[n];
        String[] res = new String[n];
        try {
            res=br.readLine().split(" ");
        }
        catch(IOException e) {
            e.printStackTrace();
        }
        for(int i=0;i<n;i++) {
            arr[i]=Integer.parseInt(res[i]);
        }

        return arr;
    }
}
