import java.util.Scanner;

public class ParkingLotSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String opt = "";
        boolean[] parkingLot = new boolean[20];
        int occupied = 0;

        while (occupied < parkingLot.length) {
            System.out.print("Enter park, exit, show occupancy : ");
            opt = sc.nextLine().trim().toLowerCase();

            switch (opt) {
                case "park":
                    System.out.print("Enter the slot you want to park (0-19): ");
                    int lot = sc.nextInt();
                    if (lot < 0 || lot >= parkingLot.length) {
                        System.out.println("Invalid slot. Choose 0 - " + (parkingLot.length - 1));
                    } else if (parkingLot[lot]) {
                        System.out.println("This is Occupied, select some other slot.");
                    } else {
                        parkingLot[lot] = true;
                        occupied++;
                        System.out.println("Parked at slot " + lot);
                    }
                    break;

                case "show occupancy":
                    System.out.print("Occupied slots : ");
                    for (int i = 0; i < parkingLot.length; i++) {
                        if (parkingLot[i]) {
                            System.out.print(i + " ");
                        }
                    }
                    break;

                case "exit":
                    System.out.println("Exiting...");
                    sc.close();
                    return;

                default:
                    System.out.println("Unexpected value: " + opt);
            }
        }

        System.out.println("Parking lot full. Thank you");
        sc.close();
    }
}
