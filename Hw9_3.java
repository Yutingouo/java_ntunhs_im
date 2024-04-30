package Hw9;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Hw9_3 {

    private static Map<String, Integer> grades = new HashMap<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean isRunning = true;
        while (isRunning) {
            System.out.println("請選擇操作:");
            System.out.println("1. 新增學生成績");
            System.out.println("2. 查詢學生成績");
            System.out.println("3. 修改學生成績");
            System.out.println("4. 刪除學生成績");
            System.out.println("5. 列出所有學生成績");
            System.out.println("0. 退出");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    addGrade();
                    break;
                case 2:
                    queryGrade();
                    break;
                case 3:
                    updateGrade();
                    break;
                case 4:
                    deleteGrade();
                    break;
                case 5:
                    listAllGrades();
                    break;
                case 0:
                    isRunning = false;
                    break;
                default:
                    System.out.println("輸入無效，請重新輸入。");
            }
        }
    }

    private static void addGrade() {
        System.out.print("請輸入學生姓名: ");
        String name = scanner.nextLine();
        System.out.print("請輸入學生成績: ");
        int grade = scanner.nextInt();
        grades.put(name, grade);
        System.out.println(name + " 的成績已添加。");
    }

    private static void queryGrade() {
        System.out.print("請輸入要查詢的學生姓名: ");
        String name = scanner.nextLine();
        if (grades.containsKey(name)) {
            System.out.println(name + " 的成績是: " + grades.get(name));
        } else {
            System.out.println("找不到 " + name + " 的成績。");
        }
    }

    private static void updateGrade() {
        System.out.print("請輸入要修改的學生姓名: ");
        String name = scanner.nextLine();
        if (grades.containsKey(name)) {
            System.out.print("請輸入新的成績: ");
            int newGrade = scanner.nextInt();
            grades.put(name, newGrade);
            System.out.println(name + " 的成績已更新。");
        } else {
            System.out.println("找不到 " + name + " 的成績，無法修改。");
        }
    }

    private static void deleteGrade() {
        System.out.print("請輸入要刪除的學生姓名: ");
        String name = scanner.nextLine();
        if (grades.containsKey(name)) {
            grades.remove(name);
            System.out.println(name + " 的成績已刪除。");
        } else {
            System.out.println("找不到 " + name + " 的成績，無法刪除。");
        }
    }

    private static void listAllGrades() {
        System.out.println("所有學生成績列表:");
        for (Map.Entry<String, Integer> entry : grades.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
