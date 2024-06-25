package chapter1.section1.practice;

public class Practice19 {
    public static class Fibonacci {
        private static final long[] cache = new long[91];
        public static long f(int n) {
            if (n == 0) return 0;
            if (n == 1) return 1;
            if (cache[n] != 0) return cache[n];
            long result = f(n - 1) + f(n - 2);
            cache[n] = result;
            return result;
        }
    }

    public static void main(String[] args) {
        for (int i = 0; i < 90; i++) {
            System.out.println(i + ":" + Fibonacci.f(i));
        }
    }
}
