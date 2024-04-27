package chapter1.section1;

public class Practice14 {
    public static void main(String[] args) {
        System.out.println(lg(1));
        System.out.println(lg(2));
        System.out.println(lg(3));
        System.out.println(lg(4));
        System.out.println(lg(5));
        System.out.println(lg(1024));
    }

    public static int lg(int n) {
        int x = 1;
        int j = 0;
        while (x <= n) {
            j++;
            x *= 2;
        }
        return j - 1;
    }
}
