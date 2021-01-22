import java.util.*;

public class COINS {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        while (scanner.hasNext()) {
            HashMap<Integer,Long> map = new HashMap<>();
		    n = scanner.nextInt();
		    System.out.println(solve(n,map));
        }
    }

    static long solve(int n, HashMap<Integer, Long> map){
	    
	    if(n < 12) return n;
	    if(map.containsKey(n)) return map.get(n);
	    
	    long res = Math.max(n, solve(n/2,map)+solve(n/3,map)+solve(n/4,map));
	    map.put(n, res);
	    
	    return res;
	    
	}
}
