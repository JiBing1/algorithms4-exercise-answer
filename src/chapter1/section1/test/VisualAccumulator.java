package chapter1.section1.test;

import edu.princeton.cs.algs4.Accumulator;
import edu.princeton.cs.algs4.StdDraw;
import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;

public class VisualAccumulator extends Accumulator {
    private double total;
    private int N;
    public VisualAccumulator(int trials, double max) {
        StdDraw.setXscale(0, trials);
        StdDraw.setYscale(0, max);
        StdDraw.setPenRadius(.005);
    }

    public void addDataValue(double val) {
        N++;
        total += val;
        StdDraw.setPenColor(StdDraw.GRAY);
        StdDraw.point(N, val);
        StdDraw.setPenColor(StdDraw.RED);
        StdDraw.point(N, total / N);
    }

    public static void main(String[] args) {
        int T = Integer.parseInt(args[0]);
        VisualAccumulator v = new VisualAccumulator(T, 1.0);
        for (int t = 0; t < T; t++) {
            v.addDataValue(StdRandom.random());
        }
        System.out.println(v);
    }
}
