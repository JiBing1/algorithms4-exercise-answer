package chapter1.section1.practice;

public class Practice29 {

    public static void main(String[] args) {
        int[] nums = new int[]{1, 4, 4, 4, 4, 4, 4, 7};
        System.out.println(rank(2, nums));
        System.out.println(count(2, nums));
    }

    /**
     * 查找有序数组中小于等于指定值的元素个数
     * @param key 指定元素
     * @param nums 有序数组
     * @return 数量
     */
    public static int rank(int key, int[] nums) {
        return lessThanKey(key, nums);
    }

    /**
     * 查找有序数组中等于指定值的元素个数
     * @param key 指定元素
     * @param nums 有序数组
     * @return 个数
     */
    public static int count(int key, int[] nums) {
        return nums.length - lessThanKey(key, nums) - greaterThanKey(key, nums);
    }

    private static int greaterThanKey(int key, int[] nums) {
        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            int middle = left + (right - left) / 2;
            if (key < nums[middle]) {
                right = middle - 1;
            } else {
                left = middle + 1;
            }
        }
        return nums.length - left;
    }

    private static int lessThanKey(int key, int[] nums) {
        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            int middle = left + (right - left) / 2;
            if (key > nums[middle]) {
                left = middle + 1;
            } else {
                right = middle - 1;
            }
        }
        return left;
    }
}
