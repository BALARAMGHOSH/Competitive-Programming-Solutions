import java.util.*;

public class ReversibleCards {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n=scanner.nextInt();
        Set<Integer> set = new HashSet<Integer>();
        long count = 0;
        for (int i = 0; i < n; i++) {
            int a=scanner.nextInt();
            int b=scanner.nextInt();
            if (set.add(a)==true || set.add(b)==true) {
                count++;
            }
        }
        System.out.println(count);
    }
}


