package chapter1.section1;

public class Practice26 {
    public static void main(String[] args) {
        int a = 3;
        int b = 2;
        int c = 1;
        int t = 0;

        // 如果a大于b， 则交换a、b的值
        if (a > b) {
            t = a;
            a = b;
            b = t;
        }
        // a <= b

        //如果a大于c， 则交互a、c的值
        if (a > c) {
            t = a;
            a = c;
            c = t;
        }
        // a <= c

        //如果b大于c， 则交换b、c的值
        if (b > c) {
            t = b;
            b = c;
            c = t;
        }
        // b <= c

        //最终 a <= b <= c
        System.out.println(a + " " + b + " " + c);
    }
}
