
public class FitnessTracker {

	public static void main(String[] args) {
		int[] pushUp = {15,20,28,0,0,32};
		int count = 0;
		int avg = 0;
		for(int n : pushUp) {
			if(n == 0) {
				continue;
			}
			count += n;
			avg++;
		}
		System.out.print("Total : "+count + " avg : "+ count/avg);
		
	}

}
