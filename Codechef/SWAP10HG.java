import java.util.Scanner;

public class SWAP10HG {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t=Integer.parseInt(scanner.nextLine());
        while (t-->0){
            int n=Integer.parseInt(scanner.nextLine());
            String s=scanner.nextLine();
            String p=scanner.nextLine();
            char[] chs=new char[n];
            char[] chp=new char[n];
            int counts0=0;
            int countp0=0;
            for (int i = 0; i < n; i++) {
                chs[i]=s.charAt(i);
                chp[i]=p.charAt(i);
                if (chs[i]=='0') counts0++;
                if(chp[i]=='0') countp0++;
            }
            
            if (counts0==countp0) {
                System.out.println("Yes");                
            }else{
                System.out.println("No");
            }
        }
    }
}
