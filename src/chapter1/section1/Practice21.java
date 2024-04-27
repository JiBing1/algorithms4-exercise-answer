package chapter1.section1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Practice21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> lines = new ArrayList<>();
        while (true) {
            String line = sc.nextLine();
            if ("q".equals(line)) {
                break;
            }
            lines.add(line);
        }
        for (String row : lines) {
            String[] cols = row.split(" ");
            int num1 = Integer.parseInt(cols[1]);
            int num2 = Integer.parseInt(cols[2]);
            float num3 = num1 * 1.0f / num2;
            System.out.println(String.format("%s %.3f", row, num3));
        }
    }
}
