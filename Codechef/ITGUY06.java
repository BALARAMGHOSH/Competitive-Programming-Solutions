import java.util.Scanner;

public class ITGUY06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t=Integer.parseInt(scanner.nextLine());
        while (t-->0) {
            String s=scanner.nextLine();
            boolean flag=true;
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i)=='5' || s.charAt(i)=='0') {
                    flag=true;
                    break;
                }else{
                    flag=false;
                }
            }
            if (flag==true) {
                System.out.println(1);
            } else {
                System.out.println(0);
            }
        }
    }
}
