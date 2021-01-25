import java.math.BigInteger;

class GFG
 {
	public static void main (String[] args)
	 {
	    Scanner scanner=new Scanner(System.in);
	    short t=scanner.nextShort();
	    while(t-->0){
	        int n=scanner.nextInt();
	        System.out.println(factorial(n));
	    }
	 }
	 
	 public static BigInteger factorial(int number) {
	     BigInteger factorial = BigInteger.ONE; 
	     for (int i = number; i > 0; i--) {
	         factorial = factorial.multiply(BigInteger.valueOf(i)); 
	     } 
	     return factorial; 
	 }
}
