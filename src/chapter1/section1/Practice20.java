package chapter1.section1;

public class Practice20 {
    public static void main(String[] args) {
        System.out.println(ln(1));
        System.out.println(ln(10));
    }
    public static double ln(int n) {
        if (n == 1) {
            return 0;
        }
        return Math.log1p(n) + ln(n - 1);
    }
}
