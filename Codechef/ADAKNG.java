import java.util.*;
import java.io.*;
import java.util.Map.Entry;


class CodeChef {

    
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while(t-->0)
        {
            String str = br.readLine();
            String ar[] = str.split(" ");
            int r = Integer.parseInt(ar[0]);
            int c = Integer.parseInt(ar[1]);
            int k = Integer.parseInt(ar[2]);
            int x = 1, y = 1,tempr1 = r, tempr2 = r, tempc1 = c, tempc2 = c;
            if(r-1>=k) x = x + k;
            else x = x + r-1;
            if(8-r>=k) x = x + k;
            else x = x + 8-r;
            if(c-1>=k) y = y + k;
            else y = y + c-1;
            if(8-c>=k) y = y + k;
            else y = y + 8-c;
            System.out.println(x*y);
        }     
                
    }
}
