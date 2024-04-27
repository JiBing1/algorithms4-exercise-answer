package chapter1.section1;

public class Practice27 {
    private static int count;

    public static void main(String[] args) {

        double d = binomial1(100, 50, 0.25);
        System.out.println(count);
        System.out.println(d);
    }

    //调用次数：天文数字
    public static double binomial (int n, int k, double p) {
        count++;
        if (n == 0 && k == 0) {
            return 1.0;
        }
        if (n < 0 || k < 0) {
            return 0.0;
        }
        return (1.0 - p) * binomial(n - 1, k, p) + p * binomial(n - 1, k - 1, p);
    }

    public static double binomial1 (int n, int k, double p) {
        double[][] cache = new double[n + 1][k + 1];
        for (int i = 0; i < n+ 1; i++) {
            for (int j = 0; j < k+ 1; j++) {
                cache[i][j] = -1;
            }
        }
        return binomial1(n, k, p, cache);
    }

    public static double binomial1(int n, int k, double p, double[][] cache) {
        count++;
        if (n == 0 && k == 0) {
            return 1.0;
        }
        if (n < 0 || k < 0) {
            return 0.0;
        }

        if (cache[n][k] != -1) {
            return cache[n][k];
        }
        double d = (1.0 - p) * binomial1(n - 1, k, p, cache) + p * binomial1(n - 1, k - 1, p, cache);
        cache[n][k] = d;
        return d;
    }
}
