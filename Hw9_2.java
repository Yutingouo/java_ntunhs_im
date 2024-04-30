package Hw9;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

	public class Hw9_2 {
		public static void main(String[] args) {
			 Set<String> phoneNumbers = new HashSet<>();
		        Scanner scanner = new Scanner(System.in);

		        System.out.println("請輸入手機號碼，輸入 0 結束：");

		        String inputNumber;
		        while (!(inputNumber = scanner.nextLine()).equals("0")) {
		            phoneNumbers.add(inputNumber);
		        }

		        System.out.println("手機號碼總數：" + phoneNumbers.size());
		        System.out.println("所有手機號碼：");
		        for (String number : phoneNumbers) {
		            System.out.println(number);
		        }
		    }
	}