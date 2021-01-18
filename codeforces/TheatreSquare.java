import java.util.Scanner;

public class TheatreSquare {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n=scanner.nextLong();
        long m=scanner.nextLong();
        long a=scanner.nextLong();
        
        long r=0,c=0;
        if(n%a==0) r=n/a;
        else r=(n/a)+1;
        if(m%a==0) c=m/a;
        else c=(m/a)+1;

        System.out.println(r*c);
    }
}
