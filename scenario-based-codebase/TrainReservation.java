import java.util.*;
public class TrainReservation {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean[] seats = new boolean[20];
		int occupied = 0;
		String opt = "";
		
		while(occupied < seats.length) {
			System.out.print("Book, Occupied, exit : ");
			opt = sc.nextLine().trim().toLowerCase();
			switch (opt) {
			case "book":
                System.out.print("Enter the slot you want to Book (0-19): ");
                int seatBook = sc.nextInt();
                if (seatBook < 0 || seatBook >= seats.length) {
                    System.out.println("Invalid slot. Choose 0 - " + (seats.length - 1));
                } else if (seats[seatBook]) {
                    System.out.println("This is Occupied, select some other slot.");
                } else {
                	seats[seatBook] = true;
                    occupied++;
                    System.out.println("Booked at slot " + seatBook);
                }
				break;
			case "occupied":
				for(int i = 0;i<seats.length;i++) {
					if(seats[i]) {
						System.out.print(i+" ");
					}
				}
				break;
			case "exit":
				System.out.println("Exiting....");
//				break;
				return;
			default:
				System.out.println("Invalid Input");
				break;
			}
		}
	}

}
