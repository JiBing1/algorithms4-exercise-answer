package chapter1.section1;

import java.util.Arrays;

public class practice33 {
    public static void main(String[] args) {
        double[] x = new double[]{1.0, 2.0, 3.0};
        double[] y = new double[]{4.0, 5.0, 6.0};

        double[][] a = new double[][]{{1.0, 2.0, 3.0}, {4.0, 5.0, 6.0}, {7.0, 8.0, 9.0}};
        double[][] b = new double[][]{{1.0, 2.0, 3.0}, {4.0, 5.0, 6.0}, {7.0, 8.0, 9.0}};

        double dot = Matrix.dot(x, y);
        System.out.println(dot);
        System.out.println("=============================");
        double[][] mult1 = Matrix.mult(a, b);
        for (double[] item : mult1) {
            System.out.println(Arrays.toString(item));
        }
        System.out.println("=============================");
        double[][] transpose = Matrix.transpose(a);
        for (double[] item : transpose) {
            System.out.println(Arrays.toString(item));
        }
        System.out.println("=============================");
        double[] mult2 = Matrix.mult(a, x);
        System.out.println(Arrays.toString(mult2));
        System.out.println("=============================");
        double[] mult3 = Matrix.mult(x, a);
        System.out.println(Arrays.toString(mult3));
    }

    private static class Matrix {
        public static double dot(double[] x, double[] y) {
            double result = 0;
            for (int i = 0; i < x.length; i++) {
                result += x[i] * y[i];
            }
            return result;
        }

        public static double[][] mult(double[][] a, double[][] b) {
            double[][] result = new double[a.length][b[0].length];
            for (int i = 0; i < a.length; i++) {
                for (int j = 0; j < result[0].length; j++) {
                    result[i][j] = 0;
                    for (int m = 0; m < a[0].length; m++) {
                        result[i][j] += a[i][m] * b[m][j];
                    }
                }
            }
            return result;
        }

        public static double[][] transpose(double[][] a) {
            double[][] result = new double[a.length][a[0].length];
            for (int i = 0; i < a.length; i++) {
                for (int j = 0; j < a[0].length; j++) {
                    result[i][j] = a[j][i];
                }
            }
            return result;
        }

        public static double[] mult(double[][] a, double[] x) {
            double[] result = new double[a.length];
            for (int i = 0; i < result.length; i++) {
                result[i] = 0;
                for (int j = 0; j < a[0].length; j++) {
                    result[i] += a[i][j] * x[j];
                }
            }
            return result;
        }

        public static double[] mult(double[] y, double[][] a) {
            double[] result = new double[a[0].length];
            for (int i = 0; i < result.length; i++) {
                result[i] = 0;
                for (int j = 0; j < y.length; j++) {
                    result[i] += y[j] * a[j][i];
                }
            }
            return result;
        }
    }
}
