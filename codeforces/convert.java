import java.io.*; 
import java.util.*;
import java.math.*;

public class convert {

  private String toAbsolute(int x, int y) {
    String s = "";

    while ((x > 0) || (s.length() == 0)) {
      s = (char)(((x - 1) % 26) + 'A') + s;
      x = (x - 1) / 26;
    }
    s += y;
    return s;
  }

  private String toRelative(int x, int y) {
    return ("R" + y + "C" + x);
  }

  private String [] parce(String s) {
    String [] ss = {"", "", "", ""};
    int idx = 0;
    while ((idx < s.length()) && (s.charAt(idx) >= 'A') && (s.charAt(idx) <= 'Z')) { ss[0] += s.charAt(idx++); }
    while ((idx < s.length()) && (s.charAt(idx) >= '0') && (s.charAt(idx) <= '9')) { ss[1] += s.charAt(idx++); }
    while ((idx < s.length()) && (s.charAt(idx) >= 'A') && (s.charAt(idx) <= 'Z')) { ss[2] += s.charAt(idx++); }
    while ((idx < s.length()) && (s.charAt(idx) >= '0') && (s.charAt(idx) <= '9')) { ss[3] += s.charAt(idx++); }
    return ss;
  }

  private int aToNumb(String s) {
    int res = 0;
    for (int i = 0; i < s.length(); i++) {
      res = 26 * res + (s.charAt(i) - 'A' + 1);
    }
    return res;
  }

  public void run() {
    int n = sc.nextInt();

    for (int i = 0; i < n ; i++) {
      String [] s = parce(sc.next());

      if (s[0].equals("R") && s[2].equals("C")) {
        pw.println(toAbsolute(Integer.parseInt(s[3]), Integer.parseInt(s[1])));
      } else {
        pw.println(toRelative(aToNumb(s[0]), Integer.parseInt(s[1])));
      }
    }
  }

  public static Scanner sc;
  public static PrintWriter pw;

  public static void main(String[] args) throws Exception {
    sc = new Scanner(new BufferedInputStream(System.in));
    pw = new PrintWriter(new BufferedOutputStream(System.out));
    
    new convert().run();

    pw.close();
  }

}