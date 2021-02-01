import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t=scanner.nextInt();
        while (t-->0){
            int n=scanner.nextInt();
            int m=scanner.nextInt();
            
            int x=scanner.nextInt();
            int y=scanner.nextInt();
            int s=scanner.nextInt();
            
            int ver = 0;
			int hor = 0;

			int tempVer = 0;
			for (int i = 1; i <= x; i++) {
				int xi = scanner.nextInt();
				ver += (xi - tempVer - 1)/s;
				tempVer = xi;
			}
			ver += (n - tempVer)/s;
			
			int tempHor = 0;
			for (int i = 1; i <= y; i++) {
				int yi = scanner.nextInt();
				hor += (yi - tempHor - 1)/s;
				tempHor = yi;
			}
			hor += (m - tempHor)/s;
			System.out.println(ver*hor);
        }
        scanner.close();
    }
}
