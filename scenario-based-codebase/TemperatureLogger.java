import java.util.*;
public class TemperatureLogger {

	public static void main(String[] args) {
		int[] temp = {25,68,95,75,15,35};
		int avgTemp = 0;
		int maxTemp = Integer.MIN_VALUE;
		for(int i = 0; i < temp.length; i++){
			avgTemp += temp[i];
			if(temp[i]>maxTemp) {
				maxTemp = temp[i];
			}
		}
		System.out.println("Maximum Temperature "+maxTemp+" Average Temperature "+avgTemp/temp.length);
	}
}