package chapter1.section1.practice;

public class Practice9 {
    public static void main(String[] args) {
        System.out.println(toBinaryString(1));
        System.out.println(toBinaryString(2));
        System.out.println(toBinaryString(3));
        System.out.println(toBinaryString(127));
        System.out.println(toBinaryString(128));
        System.out.println(toBinaryString(Integer.MAX_VALUE));
    }

    public static String toBinaryString(int n) {
        StringBuilder sb = new StringBuilder();
        while (n != 0) {
            sb.append(n % 2);
            n = n / 2;
        }
        return sb.reverse().toString();
    }
}
