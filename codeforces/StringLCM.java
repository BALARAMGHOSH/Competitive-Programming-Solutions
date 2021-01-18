import java.util.Scanner;

public class StringLCM {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t=Integer.parseInt(scanner.nextLine());
        while (t-- >0){
            String str=scanner.nextLine();
            String substr=scanner.nextLine();
            int strl=str.length();
            int substrl=substr.length();
            boolean flag=true;
            for (int i = 0; i < strl; i++) {
                if(str.charAt(i)!=substr.charAt(i%substrl) && strl%substrl==0){
                    flag=false;
                    break;
                }
            }
            if (flag==true) {
                System.out.println(-1);
            } else {
                int num=lcm(strl,substrl)/substrl;
                for (int i = 0; i < num; i++) {
                    System.out.print(substr);
                }
                System.out.println();
            }
        }
    }

    static int gcd(int a, int b)
    {
        if (a == 0)
            return b; 
        return gcd(b % a, a); 
    }
     
    // method to return LCM of two numbers
    static int lcm(int a, int b)
    {
        return (a / gcd(a, b)) * b;
    }
}
