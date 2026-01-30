package functionalInterface.functionalInterface;

public class BackgroundJobExecution {
	
	public static void main(String[] args) {
		Runnable task1 = () -> {
			System.out.println("Task 1 Started "+ Thread.currentThread().getName());
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("Task 1 Finised " + Thread.currentThread().getName());
		};
		
		Runnable task2 = () -> {
			System.out.println("Task 2 Started " + Thread.currentThread().getName());
			try {
				Thread.sleep(4000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("Task 2 finised " + Thread.currentThread().getName());
		};
		
		new Thread(task1).start();
		new Thread(task2).start();
		
		System.out.println("Thread is contunue working ...");
	}
}
