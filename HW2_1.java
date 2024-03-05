package HW2;
import java.util.Scanner;


public class HW2_1 {
	static String Q1;
	static String Q2;
	static String Q3;
	static String Q4;
	static String Q5;
	static String Q6;
	
	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("歡迎使用醫療診斷系統,請依序回答問題!");
		System.out.println("請問您最近是否發燒(y/n):");
		Q1=sc.nextLine();
		if(Q1.toLowerCase().equals("y")) {
			System.out.println("請問您最近是否咳嗽(y/n):");
			Q2=sc.nextLine();
			if(Q2.toLowerCase().equals("y")) {
				System.out.println("請問您最近是否感覺疲倦(y/n):");
				Q3=sc.nextLine();
				if(Q3.toLowerCase().equals("y")) {
					System.out.println("可能是感冒!");
				}
				else if(Q3.toLowerCase().equals("n")) {
					System.out.println("可能是其他系統疾病!");
				}
			}
			else if(Q2.toLowerCase().equals("n")) {
				System.out.println("請問您最近是否血壓升高(y/n):");
				Q4=sc.nextLine();
				if(Q4.toLowerCase().equals("y")) {
					System.out.println("請問您最近是否口乾(y/n):");
					Q5=sc.nextLine();
					if(Q5.toLowerCase().equals("y")) {
						System.out.println("可能是肝病!");
					}
					else if(Q5.toLowerCase().equals("n")) {
						System.out.println("可能是其他系統疾病!");
					}
				}
				else if(Q4.toLowerCase().equals("n")) {
					System.out.println("請問您最近是否盜汗(y/n):");
					Q6=sc.nextLine();
					if(Q6.toLowerCase().equals("y")) {
						System.out.println("可能是肺病!");
					}
					else if(Q6.toLowerCase().equals("n")) {
						System.out.println("可能是其他系統疾病!");
					}
				}
			}
		}
		else if(Q1.toLowerCase().equals("n")) {
			System.out.println("正常!");
		}
		

	}

}
