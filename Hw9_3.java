package Hw9;

import java.util.HashMap;
import java.util.Map;

public class Hw9_3 {

    public static void main(String[] args) {
        // 創建一個HashMap來存儲學生名字和對應的成績
        Map<String, Integer> grades = new HashMap<>();

        // 添加學生和他們的成績
        grades.put("Alice", 90);
        grades.put("Bob", 82);
        grades.put("Charlie", 88);

        // 打印所有學生的成績
        System.out.println("學生成績列表:");
        for (Map.Entry<String, Integer> entry : grades.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        // 查找特定學生的成績
        String studentName = "Alice";
        if (grades.containsKey(studentName)) {
            System.out.println(studentName + "的成績是: " + grades.get(studentName));
        } else {
            System.out.println("沒有找到" + studentName + "的成績。");
        }

        // 更新學生的成績
        grades.put("Alice", 95);
        System.out.println("更新後，Alice的成績是: " + grades.get("Alice"));

        // 移除一位學生的記錄
        grades.remove("Bob");
        System.out.println("Bob的成績被移除後，成績列表更新為:");
        grades.forEach((key, value) -> System.out.println(key + ": " + value));
    }
}
