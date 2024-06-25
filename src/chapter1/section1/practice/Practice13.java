package chapter1.section1.practice;

public class Practice13 {
    public static void main(String[] args) {
        int[][] arr = new int[][]{{1,2,3,4}, {2,8,10,6}, {4,8,5,11}};
        System.out.println("原数组为：");
        printArr(arr);
        System.out.println("倒转数组后为：");
        reverseAndPrintArr(arr);
    }

    private static void printArr(int[][] arr) {
        for (int[] ints : arr) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(ints[j]);
                System.out.print("\t");
            }
            System.out.println();
        }
    }

    private static void reverseAndPrintArr(int[][] arr) {
        for (int i = 0; i < arr[0].length; i++) {
            for (int[] ints : arr) {
                System.out.print(ints[i]);
                System.out.print("\t");
            }
            System.out.println();
        }
    }
}
