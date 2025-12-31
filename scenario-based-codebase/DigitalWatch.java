import java.util.*;

public class DigitalWatch {
	public static void stopWatch(int stopHour) {
		for(int i = 0; i < 24 ; i++) {
			for(int j = 0 ; j < 60 ; j++) {
				System.out.printf("%02d:%02d\n",i,j);
				if(i == stopHour && j == 0) {
					break;
				}
			}
			if(i == stopHour) {
				break;
			}
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("stop time : ");
		int stopHour = sc.nextInt();
		stopWatch(stopHour);
	}

}
