import java.util.Scanner;

public class WatCoder {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int sum=0;
        for (int i = 0; i < 3; i++) {
            int temp=scanner.nextInt();
            sum+=temp;
        }
        scanner.nextLine();
        String str=scanner.nextLine();
        System.out.println(sum+" "+str);
    }
}
