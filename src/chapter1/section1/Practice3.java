package chapter1.section1;

import java.util.Scanner;

public class Practice3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (;;) {
            String input = sc.nextLine();

            String[] numsString = input.split(" ");
            if (numsString.length != 3) {
                System.out.println("输入不合法，请重新输入");
                continue;
            }
            boolean result = true;
            int first = Integer.parseInt(numsString[0]);
            for (String num : numsString) {
                int i = Integer.parseInt(num);
                if (i != first) {
                    System.out.println("not equal");
                    result = false;
                    break;
                }
            }
            if (result) {
                System.out.println("equal");
            }
        }
    }
}
