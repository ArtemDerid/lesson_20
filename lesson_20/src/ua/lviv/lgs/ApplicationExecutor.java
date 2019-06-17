package ua.lviv.lgs;

import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ApplicationExecutor {
	public static void main(String[] args) {

		ExecutorService executable = Executors.newCachedThreadPool();
		
		executable.execute(new Runnable() {
			@Override
			public void run() {
				int n;
				System.out.println("Enter how much fibonacci numbers (from 1 to 50) do you want tu see");
				Scanner scanner = new Scanner(System.in);
				n = scanner.nextInt();
				int[] array = new int[n+1];
				array[0] = 0;
				array[1] = 1;
				for (int i = 2; i <= n; i++) {
					array[i] = array[i - 2] + array[i - 1];
				}

				for (int i = n; i > 0; i--) {
					System.out.print(array[i] + " ");

					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		
		});
		
		executable.shutdown();
	}
}
