import java.util.Scanner;

public class boringApartments {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t=scanner.nextInt();
        while (t-->0){
            int x=scanner.nextInt();
            System.out.println(solve(x));
        }
    }
    
    static int solve(int x){
        int temp=x%10;
        int count=0;
        int ans=0;
        if(x==1) ans=1;
        else if(x==11) ans=3;
        else if(x==111) ans=6;
        else if(x==1111) ans=10;
        else{
            while(x/10!=0){
                x=x/10;
                count++;
            }
            int temp2=0;
            if(count==0) temp2=1;
            else if(count==1) temp2=3;
            else if(count==2) temp2=6;
            else if(count==3) temp2=10;
            
    
            ans=temp2+((temp-1)*10);
        }
        return ans;
    }
}
