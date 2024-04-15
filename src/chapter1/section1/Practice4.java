package chapter1.section1;

public class Practice4 {
    public static void main(String[] args) {
        System.out.println(betweenZeroAndOne(0.1, 0.9999999999999999999));
    }

    public static boolean betweenZeroAndOne(double x, double y) {
        return x > 0 && x < 1  && y > 0 && y < 1;
    }


}
