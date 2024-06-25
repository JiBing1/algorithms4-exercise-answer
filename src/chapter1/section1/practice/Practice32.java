package chapter1.section1.practice;

import edu.princeton.cs.algs4.StdDraw;
import edu.princeton.cs.algs4.StdStats;

import java.util.Arrays;
import java.util.Scanner;

public class Practice32 {
    public static void main(String[] args) {
        int n = 4;
        double l = 2.5;
        double r = 9.3;

        double[] numbersArray = new double[]{2, 2.5, 4.3, 5.5, 6.6, 6.7, 6.8, 8.3, 10};

        int[] distribution = getDistribution(l, r, n, numbersArray);
        System.out.println(Arrays.toString(distribution));
        draw(l, r, n, distribution);
        /*Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("请输入区间小值：");
            double l = sc.nextDouble();
            System.out.println("请输入区间大值：");
            double r = sc.nextDouble();
            System.out.println("请输入区间划分个数：");
            int n = sc.nextInt();
            System.out.println("请输入一系列浮点数，用空格分开：");
            sc.nextLine();
            String line = sc.nextLine();
            String[] strNum = line.split(" ");
            double[] nums = new double[strNum.length];
            for (int i = 0; i < strNum.length; i++) {
                nums[i] = Double.parseDouble(strNum[i]);
            }
            int[] distribution = getDistribution(l, r, n, nums);
            draw(l, r, n, distribution);
        }*/
    }

    public static int[] getDistribution(double l, double r, int n, double[] nums) {
        int[] result = new int[n];
        double diff = (r - l) / n;

        for (double d : nums) {
            if (d >= l && d <= r) {
                int offset = (int) ((d - l) / diff);
                result[offset]++;
            }
        }

        return result;
    }

    public static void draw(double l, double r, int n, int[] nums) {
        int maxCount = StdStats.max(nums);

        double minX = l - 1;
        double maxX = r + 1;
        double minY = -2;
        double maxY = maxCount + 2;
        StdDraw.setCanvasSize(1024, 512);
        StdDraw.setXscale(minX, maxX);
        StdDraw.setYscale(minY, maxY);

        double middleX = minX + (maxX - minX) / 2;
        double middleY = minY + (maxY - minY) / 2;

        // Labels
        StdDraw.text(middleX, maxY - 0.5, "Numbers in intervals");
        StdDraw.text(minX + 0.25, middleY, "Numbers", 90);
        StdDraw.text(middleX, -1.2, "Intervals");
        double diff = (r - l) / n;
        // X labels
        for (int x = 0; x < nums.length; x++) {
            double minValue = l + (diff * x);
            double maxValue = minValue + diff - 0.01;
            String intervalDescription = String.format("[%.2f - %.2f]", minValue, maxValue);
            StdDraw.text(l + (x + 0.5) * diff, -0.25, intervalDescription);
        }

        // Y labels
        for (int y = 0; y < maxY; y++) {
            StdDraw.text(minX + 0.7, y, String.valueOf(y));
        }

        for (int i = 0; i < nums.length; i++) {
            double x = l + (i + 0.5) * diff;
            double y = nums[i] / 2.0;
            double halfWidth = diff / 3.0;
            double halfHeight = nums[i] / 2.0;

            StdDraw.filledRectangle(x, y, halfWidth, halfHeight);
        }
    }
}
