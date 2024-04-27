package chapter1.section1;

import java.util.Arrays;

public class Practice28 {
    public static void main(String[] args) {
        int[] whiteList = new int[]{23, 43, 1, 2, 44, 23, 11, 44, 1, 4, 2, 6, 11, 12, 22, 23, 5, 6};

        System.out.println("去除重复数字后的期望值为：[1, 2, 4, 5, 6, 11, 12, 22, 23, 43, 44]");
        System.out.println("去除重复数字后的实际值为：" + Arrays.toString(removeDuplicates(whiteList)));

    }

    public static int[] removeDuplicates (int[] nums) {
        Arrays.sort(nums);
        int[] result = new int[nums.length];
        int count = 0;
        result[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != result[count]) {
                count++;
                result[count] = nums[i];
            }
        }
        int[] newResult = new int[count + 1];
        System.arraycopy(result, 0, newResult, 0, count + 1);
        return newResult;
    }
}
