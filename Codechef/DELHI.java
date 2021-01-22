import java.util.*;
import java.lang.*;

public class DELHI {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n=scanner.nextInt();
        while (n-->0){
            int carNum = scanner.nextInt();
            int temp=carNum;
            int count=0;
            while (temp/10!=0){
                temp=temp/10;
                count++;
            }
            count=count+1;
            System.out.println(count);
            int i=1;
            int even=0;
            int odd=0;
            while (carNum/10!=0){
                if (i%2==0) {
                    even=even+(carNum/(int)(Math.pow(10,count-1)));
                } else {
                    odd=odd+(carNum/(int)(Math.pow(10,count-1)));
                }
                carNum=carNum%(int)(Math.pow(10,count-1));
                count--;
                i++;
            }
            if (even%4==0 || odd%3==0) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
    }
}
