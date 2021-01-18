import java.util.Scanner;

public class ThreePoint {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x=scanner.nextInt();
        int y=scanner.nextInt();
        boolean ans=solution(x,y);
        if (ans==true) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }

    public static boolean solution(int x, int y) {
        boolean bool=true;
        if(x==y) bool=false;
        else if(x<y) {
            if(y-x<3) bool=true;
            else bool=false;
        }else if(x>y){
            if(x-y<3) bool=true;
            else bool=false;
        }
        return bool;
    }
}
