package ua.lviv.lgs;

import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorsApp {

	public static void main(String[] args) {
		
		ExecutorService executor = Executors.newSingleThreadExecutor();
		executor.execute(new Runnable() {

			@Override
			public void run() {
				int n1 = 0;
				int n2 = 1;
				int n;
				System.out.println("Enter how much fibonacci numbers (from 1 to 50) do you want tu see");
				Scanner scanner = new Scanner(System.in);
				n = scanner.nextInt();
				System.out.print("1 ");
				for (int i = 2; i <= n; i++) {
					int n_next = n1 + n2;
					n1 = n2;
					n2 = n_next;
					if (i==1) {
						System.out.print("1 ");
					} else {
						System.out.print(n_next + " ");
					}
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
			
		});
		
		executor.shutdown();
		
	}

}
