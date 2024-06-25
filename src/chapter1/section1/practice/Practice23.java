package chapter1.section1.practice;

import java.util.Arrays;
import java.util.Scanner;

public class Practice23 {
    public static void main(String[] args) {
        int[] whiteList = new int[]{4, 6, 3, 43, 12, 56, 18, 44, 22, 32, 12, 16};
        Arrays.sort(whiteList);
        System.out.println("白名单为：" + Arrays.toString(whiteList));
        Scanner sc = new Scanner(System.in);
        System.out.println("请选择操作：+: 只会输出在白名单里的值；-: 只会输出不在白名单的值");
        String operator = sc.nextLine();
        while (true) {
            System.out.println("请随便输入一个数");
            int key = Integer.parseInt(sc.nextLine());
            int index = binarySearch(whiteList, key);
            if (index != -1 && "+".equals(operator)) {
                System.out.println("在白名单中：" + key);
            } else if (index == -1 && "-".equals(operator)) {
                System.out.println("不在白名单中：" + key);
            }
        }
    }

    public static int binarySearch (int[] nums, int key) {
        int low = 0;
        int high = nums.length - 1;
        while (low <= high) {
            int middle = low + (high - low) / 2;
            if (nums[middle] == key) {
                return middle;
            } else if (nums[middle] > key) {
                high = middle - 1;
            } else {
                low = middle + 1;
            }
        }
        return -1;
    }
}
