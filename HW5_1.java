package HW5;
import java.util.Scanner;
class StoreValuecard{
	private String cardId;
	private int balance;
	private int bonus;
	static int totalCardNum;
	int getBalance() {
		return balance;
	
	}
	int getBonus() {
		return bonus;
	}
	String getNumber() {
		return cardId;
	}
	StoreValuecard(){}
	StoreValuecard(String cardId,int balance,int bonus){
		this.cardId=cardId;
		this.balance=balance;
		this.bonus=bonus;
		totalCardNum++;
	}
	
	void exchangeBonus(int bonus) {
		if(bonus>0) {
			if(bonus<this.bonus) {
				this.bonus-=bonus;
			}
			else {
				System.out.println("紅利不足，無法兌換");
			}
		}
		else {
			System.out.println("請確認兌換紅利不為負數");
		}
	}
	
	void charge(int money) {
		if(money>0) {
			if(money<this.balance) {
				this.balance-=money;
			}
			else {
				System.out.println("餘額不足，請儲值");
			}
		}
		else {
			System.out.println("請確認扣款金額不為負數");
		}
	}
	
	void printDetails() {
		System.out.printf("(%s,%d,%d)%n",this.cardId,this.balance,this.bonus);
	}
	void addValue(int money) {
		if(money>0) {
			this.balance+=money;
			if(money>=1000) {
				this.bonus++;
			}
		}else {
			System.out.println("請確認儲值金額不能是負數!");
		}
	}
}
public class HW5_1 {
    public static void main(String[] args) {
        StoreValuecard people = new StoreValuecard("ntunsh", 1000, 0);
        var sc = new Scanner(System.in);
        int choice;
        do {
            System.out.println("請輸入指令 : 1.儲值 2.扣款 3.兌換 4.明細 0.離開:");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("請輸入儲值金額:");
                    int depositAmount = sc.nextInt();
                    people.addValue(depositAmount);
                    people.printDetails();
                    break;
                case 2:
                    System.out.println("請輸入扣款金額:");
                    int chargeAmount = sc.nextInt();
                    people.charge(chargeAmount);
                    people.printDetails();
                    break;
                case 3:
                    System.out.println("請輸入要兌換的紅利:");
                    int bonusToExchange = sc.nextInt();
                    people.exchangeBonus(bonusToExchange);
                    people.printDetails();
                    break;
                case 4:
                    people.printDetails();
                    break;
                case 0:
                    System.out.println("離開程式，感謝使用！");
                    break;
                default:
                    System.out.println("無效指令，請重新輸入。");
                    break;
            }
        } while (choice != 0); 
        sc.close();
    }
}
