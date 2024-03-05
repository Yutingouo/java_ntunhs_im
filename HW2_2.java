package HW2;
import java.util.Scanner;
import java.util.Random;

public class HW2_2 {

	public static void main(String[] args) {
		Random rand=new Random();
		int ans=rand.nextInt(10);
		int guess=0;
		int Maxx=10;
		int minn=1;
		Scanner sc=new Scanner(System.in);
		while(true) {
			System.out.print("請輸入一個數字:");
			guess=sc.nextInt();
			
			int validate_num=ans-guess;
			if(validate_num>0) {
				System.out.println("猜太小了");
				System.out.println(guess+"to"+Maxx);
				minn=guess;
				
			}
			else if(validate_num<0){
				System.out.println("猜太大了");
				System.out.println(minn+"to"+guess);
				Maxx=guess;
			}
			else {
				System.out.println("猜對了");
				break;
			}
		}
		

	}

}
