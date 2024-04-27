package chapter1.section1;

public class Practice11 {
    public static void main(String[] args) {
        boolean[][] arr = new boolean[][]{{true, false, true}, {false, false, true}, {true, true, false}};
        printArray(arr);
    }

    public static void printArray(boolean[][] arr) {
        int colNum = arr[0].length;
        System.out.print(" ");
        for (int i = 0; i < colNum; i++) {
            System.out.print("\t" + i);
        }
        System.out.println();
        for (int i = 0; i < arr.length; i++) {
            System.out.print(i);
            for (int j = 0; j < colNum; j++) {
                System.out.print("\t");
                if (arr[i][j]) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
