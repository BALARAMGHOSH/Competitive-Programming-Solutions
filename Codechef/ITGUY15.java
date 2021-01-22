import java.util.*;
import java.lang.*;
import java.io.*;

public class ITGUY15 {
    public static void main(String[] args) throws java.lang.Exception{
        try {
            Scanner sc=new Scanner(System.in);
            int t=sc.nextInt();
            while (t-->0) {
                String str=sc.next();
                while (str.contains("abc")){
                    str=str.replace("abc", "");
                }
                System.out.println(str);
            }
        }catch(Exception e){
        }
    }
}
