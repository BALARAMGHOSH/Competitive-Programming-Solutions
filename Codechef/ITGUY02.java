import java.util.Scanner;

public class ITGUY02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t=scanner.nextInt();
        while (t-->0){
            int rows=scanner.nextInt();
            for (int i=1; i<= rows ; i++)
            {
                for (int j = i; j < rows ; j++) {
                    System.out.print(" ");
                }   
                for (int k = 1; k <= (2*i -1) ;k++) {
                    if( k==1 || i == rows || k==(2*i-1)) {
                        System.out.print("*");
                    }
                    else {
                        System.out.print(" ");
                    }
                }
                System.out.println("");
            }
        }
        System.out.println();
    }
}
