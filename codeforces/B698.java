/* Code by Balaram Ghosh */
 
import java.util.*;
import java.io.*;
import java.math.*;
 
public class B698 {
    public static void main(String[] args) throws IOException {
        PrintWriter out = new PrintWriter(System.out);
        Reader s = new Reader();
        int t = s.i();
        while (t-- > 0) {
            int q = s.i() , d = s.i();
            while (q-- > 0) {
                int n = s.i();
                if (d == 1) {
                    out.println("YES");
                } else if (d == 2) {
                    int x = n%d;
                    if (x == 0) {
                        out.println("YES");
                    } else if (x == 1) {
                        if (n >= 21) out.println("YES");
                        else out.println("NO");
                    }
                } else if (d == 3) {
                    int x = n%d;
                    if (x == 0) {
                        out.println("YES");
                    } else if (x == 1) {
                        if (n >= 13) out.println("YES");
                        else out.println("NO");
                    } else if (x == 2) {
                        if (n >= 23) out.println("YES");
                        else out.println("NO");
                    }
                } else if (d == 4) {
                    int x = n%d;
                    if (x == 0) {
                        out.println("YES");
                    } else if (x == 1) {
                        if (n >= 41) out.println("YES");
                        else out.println("NO");
                    } else if (x == 2) {
                        if (n >= 14) out.println("YES");
                        else out.println("NO");
                    } else if (x == 3) {
                        if (n >= 43) out.println("YES");
                        else out.println("NO");
                    }
                } else if (d == 5) {
                    int x = n%d;
                    if (x == 0) {
                        out.println("YES");
                    } else if (x == 1) {
                        if (n >= 51) out.println("YES");
                        else out.println("NO");
                    } else if (x == 2) {
                        if (n >= 52) out.println("YES");
                        else out.println("NO");
                    } else if (x == 3) {
                        if (n >= 53) out.println("YES");
                        else out.println("NO");
                    } else if (x == 4) {
                        if (n >= 54) out.println("YES");
                        else out.println("NO");
                    }
                } else if (d == 6) {
                    int x = n%d;
                    if (x == 0) {
                        out.println("YES");
                    } else if (x == 1) {
                        if (n >= 61) out.println("YES");
                        else out.println("NO");
                    } else if (x == 2) {
                        if (n >= 26) out.println("YES");
                        else out.println("NO");
                    } else if (x == 3) {
                        if (n >= 63) out.println("YES");
                        else out.println("NO");
                    } else if (x == 4) {
                        if (n >= 16) out.println("YES");
                        else out.println("NO");
                    } else if (x == 5) {
                        if (n >= 65) out.println("YES");
                        else out.println("NO");
                    }
                } else if (d == 7) {
                    int x = n%d;
                    if (x == 0) {
                        out.println("YES");
                    } else if (x == 1) {
                        if (n >= 57) out.println("YES");
                        else out.println("NO");
                    } else if (x == 2) {
                        if (n >= 37) out.println("YES");
                        else out.println("NO");
                    } else if (x == 3) {
                        if (n >= 17) out.println("YES");
                        else out.println("NO");
                    } else if (x == 4) {
                        if (n >= 67) out.println("YES");
                        else out.println("NO");
                    } else if (x == 5) {
                        if (n >= 47) out.println("YES");
                        else out.println("NO");
                    } else if (x == 6) {
                        if (n >= 27) out.println("YES");
                        else out.println("NO");
                    }
                } else if (d == 8) {
                    int x = n%d;
                    if (x == 0) {
                        out.println("YES");
                    } else if (x == 1) {
                        if (n >= 81) out.println("YES");
                        else out.println("NO");
                    } else if (x == 2) {
                        if (n >= 18) out.println("YES");
                        else out.println("NO");
                    } else if (x == 3) {
                        if (n >= 83) out.println("YES");
                        else out.println("NO");
                    } else if (x == 4) {
                        if (n >= 28) out.println("YES");
                        else out.println("NO");
                    } else if (x == 5) {
                        if (n >= 85) out.println("YES");
                        else out.println("NO");
                    } else if (x == 6) {
                        if (n >= 38) out.println("YES");
                        else out.println("NO");
                    } else if (x == 7) {
                        if (n >= 87) out.println("YES");
                        else out.println("NO");
                    }
                } else if (d == 9) {
                    int x = n%d;
                    if (x == 0) {
                        out.println("YES");
                    } else if (x == 1) {
                        if (n >= 19) out.println("YES");
                        else out.println("NO");
                    } else if (x == 2) {
                        if (n >= 29) out.println("YES");
                        else out.println("NO");
                    } else if (x == 3) {
                        if (n >= 39) out.println("YES");
                        else out.println("NO");
                    } else if (x == 4) {
                        if (n >= 49) out.println("YES");
                        else out.println("NO");
                    } else if (x == 5) {
                        if (n >= 59) out.println("YES");
                        else out.println("NO");
                    } else if (x == 6) {
                        if (n >= 69) out.println("YES");
                        else out.println("NO");
                    } else if (x == 7) {
                        if (n >= 79) out.println("YES");
                        else out.println("NO");
                    } else if (x == 8) {
                        if (n >= 89) out.println("YES");
                        else out.println("NO");
                    }
                }
            }
        }
        out.flush();
    }
 
    public static void shuffle(long[] arr) {
        int n = arr.length;
        Random rand = new Random();
        for (int i = 0; i < n; i++) {
            long temp = arr[i];
            int randomPos = i + rand.nextInt(n - i);
            arr[i] = arr[randomPos];
            arr[randomPos] = temp;
        }
    }
 
    private static int gcd(int a, int b) {
        if(b == 0) return a;
        return gcd(b,a%b);
    }
 
    public static long nCr(long[] fact, long[] inv, int n, int r, long mod) {
        if (n < r)
            return 0;
        return ((fact[n] * inv[n - r]) % mod * inv[r]) % mod;
    }
 
    private static void factorials(long[] fact, long[] inv, long mod, int n) {
        fact[0] = 1;
        inv[0] = 1;
        for (int i = 1; i <= n; ++i) {
            fact[i] = (fact[i - 1] * i) % mod;
            inv[i] = power(fact[i], mod - 2, mod);
        }
    }
 
    private static long power(long a, long n, long p) {
        long result = 1;
        while (n > 0) {
            if (n % 2 == 0) {
                a = (a * a) % p;
                n /= 2;
            } else {
                result = (result * a) % p;
                n--;
            }
        }
        return result;
    }
 
    private static long power(long a, long n) {
        long result = 1;
        while (n > 0) {
            if (n % 2 == 0) {
                a = (a * a);
                n /= 2;
            } else {
                result = (result * a);
                n--;
            }
        }
        return result;
    }
 
    private static long query(long[] tree, int in, int start, int end, int l, int r) {
        if (start >= l && r >= end) return tree[in];
        if (end < l || start > r) return 0;
        int mid = (start + end) / 2;
        long x = query(tree, 2 * in, start, mid, l, r);
        long y = query(tree, 2 * in + 1, mid + 1, end, l, r);
        return x + y;
    }
 
    private static void update(int[] arr, long[] tree, int in, int start, int end, int idx, int val) {
        if (start == end) {
            tree[in] = val;
            arr[idx] = val;
            return;
        }
        int mid = (start + end) / 2;
        if (idx > mid) update(arr, tree, 2 * in + 1, mid + 1, end, idx, val);
        else update(arr, tree, 2 * in, start, mid, idx, val);
        tree[in] = tree[2 * in] + tree[2 * in + 1];
    }
 
    private static void build(int[] arr, long[] tree, int in, int start, int end) {
        if (start == end) {
            tree[in] = arr[start];
            return;
        }
        int mid = (start + end) / 2;
        build(arr, tree, 2 * in, start, mid);
        build(arr, tree, 2 * in + 1, mid + 1, end);
        tree[in] = (tree[2 * in + 1] + tree[2 * in]);
    }
 
    static class Reader {
        private InputStream mIs;
        private byte[] buf = new byte[1024];
        private int curChar, numChars;
 
        public Reader() {
            this(System.in);
        }
 
        public Reader(InputStream is) {
            mIs = is;
        }
 
        public int read() {
            if (numChars == -1) throw new InputMismatchException();
            if (curChar >= numChars) {
                curChar = 0;
                try {
                    numChars = mIs.read(buf);
                } catch (IOException e) {
                    throw new InputMismatchException();
                }
                if (numChars <= 0) return -1;
            }
            return buf[curChar++];
        }
 
        public String nextLine() {
            int c = read();
            while (isSpaceChar(c)) c = read();
            StringBuilder res = new StringBuilder();
            do {
                res.appendCodePoint(c);
                c = read();
            } while (!isEndOfLine(c));
            return res.toString();
        }
 
        public String s() {
            int c = read();
            while (isSpaceChar(c)) c = read();
            StringBuilder res = new StringBuilder();
            do {
                res.appendCodePoint(c);
                c = read();
            } while (!isSpaceChar(c));
            return res.toString();
        }
 
        public long l() {
            int c = read();
            while (isSpaceChar(c)) c = read();
            int sgn = 1;
            if (c == '-') {
                sgn = -1;
                c = read();
            }
            long res = 0;
            do {
                if (c < '0' || c > '9') throw new InputMismatchException();
                res *= 10;
                res += c - '0';
                c = read();
            } while (!isSpaceChar(c));
            return res * sgn;
        }
 
        public int i() {
            int c = read();
            while (isSpaceChar(c)) c = read();
            int sgn = 1;
            if (c == '-') {
                sgn = -1;
                c = read();
            }
            int res = 0;
            do {
                if (c < '0' || c > '9') throw new InputMismatchException();
                res *= 10;
                res += c - '0';
                c = read();
            } while (!isSpaceChar(c));
            return res * sgn;
        }
 
        public double d() throws IOException {
            return Double.parseDouble(s());
        }
 
        public boolean isSpaceChar(int c) {
            return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
        }
 
        public boolean isEndOfLine(int c) {
            return c == '\n' || c == '\r' || c == -1;
        }
 
        public int[] arr(int n) {
            int[] ret = new int[n];
            for (int i = 0; i < n; i++) {
                ret[i] = i();
            }
            return ret;
        }
 
        public long[] arrLong(int n) {
            long[] ret = new long[n];
            for (int i = 0; i < n; i++) {
                ret[i] = l();
            }
            return ret;
        }
    }
//    static class pairLong implements Comparator<pairLong> {
//        long first, second;
//
//        pairLong() {
//        }
//
//        pairLong(long first, long second) {
//            this.first = first;
//            this.second = second;
//        }
//
//        @Override
//        public int compare(pairLong p1, pairLong p2) {
//            if (p1.first == p2.first) {
//                if(p1.second > p2.second) return 1;
//                else return -1;
//            }
//            if(p1.first > p2.first) return 1;
//            else return -1;
//        }
//    }
//    static class pair implements Comparator<pair> {
//        int first, second;
//
//        pair() {
//        }
//
//        pair(int first, int second) {
//            this.first = first;
//            this.second = second;
//        }
//
//        @Override
//        public int compare(pair p1, pair p2) {
//            if (p1.first == p2.first) return p1.second - p2.second;
//            return p1.first - p2.first;
//        }
//    }
}

/* Code by Balaram Ghosh */

