import java.util.*;
public class ShopkeepersDiscount {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int bill = sc.nextInt();
		if(bill > 1000 && bill < 1500) {
			bill -= bill/10;
			System.out.println("You get 10% discount "+ bill);
		}else if(bill > 1500 && bill < 2500) {
			bill -= (bill*100)/15;
			System.out.println("You get 15% discount "+ bill);
		}else if(bill > 2500 && bill < 3500) {
			bill -= (bill*100)/20;
			System.out.println("You get 20% discount "+ bill);
		}else if(bill > 3500 && bill < 5000) {
			bill -= (bill*100)/25;
			System.out.println("You get 25% discount "+ bill);
		}else {
			System.out.println("Not eligible for the discount");
		}
	}
}
