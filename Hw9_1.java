package Hw9;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Hw9_1 {
    public static void main(String[] args) {

        int sum = 0, line = 0;
        boolean isLoop = true;
        List<Integer> list = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        while (isLoop) {
            line = input("請輸入數字,如果結束操作請輸入-1:", scanner);
            if (line == -1) isLoop = false;
            else {
                list.add(line);
            }
        }
        Collections.sort(list);
        for (int n : list) sum += n;
        System.out.println("min: " + list.get(0) + " max:" + list.get(list.size() - 1) + " avg: " + (double) sum / list.size());
    }

    static int input(String prompt, Scanner scanner) {
        System.out.print(prompt);
        return scanner.nextInt();
    }
}