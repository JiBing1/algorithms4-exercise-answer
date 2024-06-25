package chapter1.section1.practice;

import java.util.Scanner;

public class Practice24 {
    public static void main(String[] args) {
        System.out.println(gcd(105, 24, 1));
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("请输入要求公约数的两个整数，用空格分隔：");
            String line = sc.nextLine();
            String[] nums = line.split(" ");
            int num1 = Integer.parseInt(nums[0]);
            int num2 = Integer.parseInt(nums[1]);
            System.out.println("求解过程为：");
            int result = gcd(num1, num2, 1);
            System.out.println("求解结果为：" + result);
            System.out.println();
        }
    }

    public static int gcd (int x, int y, int count) {
        System.out.println("第" + count + "次调用参数为：" + x + "  " + y);
        if (y == 0) {
            return x;
        }
        return gcd(y, x % y, count + 1);
    }
}
