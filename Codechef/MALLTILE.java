import java.util.*;

class MALLTILE {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n=scanner.nextInt();
        int m=scanner.nextInt();
        int a=scanner.nextInt();
        int x=0,y=0;
        if (n%a==0) {
            x=n/a;
        }else{
            x=(n/a)+1;
        }
        if (m%a==0) {
            y=m/a;
        } else {
            y=(m/a)+1;
        }
        System.out.println(x*y);
    }
}
