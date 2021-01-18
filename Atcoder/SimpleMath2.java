import java.util.*;
import java.math.*;

/**
 * SimpleMath2
 */
public class SimpleMath2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BigInteger n=scanner.nextBigInteger();
        BigInteger m=scanner.nextBigInteger();
        int ten=10;
        BigInteger temp1=ten.pow(n)/m;
        BigInteger temp2=temp1%m;
        System.out.println(temp2);
    }
}