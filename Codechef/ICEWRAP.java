import java.util.*;

class ICEWRAP {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n=scanner.nextInt();
        int length=2*n-1;
        for (int i = 0; i < length; i++)
        {
            for (int j = 0; j < length; j++)
            {
                int minimun=i<j? i:j;
                minimun=minimun<length-i? minimun:length-i-1;
                minimun=minimun<length-j-1? minimun:length-j-1;
                System.out.print(n-minimun+" ");
            }
            System.out.println();
        }
    }
}
