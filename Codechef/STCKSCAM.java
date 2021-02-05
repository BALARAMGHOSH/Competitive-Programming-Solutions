import java.util.*;
import java.lang.Math; 


class STCKSCAM {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long s=scanner.nextLong();
        int k=scanner.nextInt();
        int count=0;
        long copy=s;
        while (copy!=0){
            copy/=10;
            ++count;
        }
        System.out.println(count);
        long[] arr=new long[count];

        for (int j=0,i=count-1; i >= 0 && j<count ; i--,j++){
            arr[j]=s/(long)(Math.pow(10,i));
            s=s%(long)(Math.pow(10,i));
        }
        for (int i= 0; i <count; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        
        System.out.println();
        for (int i= 0; i <k;i++){
            arr[i]=9;
        }
        for (int i= 0; i <count; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        
        System.out.println();
        long ans=0;
        for (int j=0,i=count-1; i >= 0 && j<count ; i--,j++){
            ans+=arr[j]*(long)(Math.pow(10,i));
        }
        System.out.println(ans);
        
    }
}
