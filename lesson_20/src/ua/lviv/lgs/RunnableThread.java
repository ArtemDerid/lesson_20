package ua.lviv.lgs;

import java.util.Scanner;

public class RunnableThread implements Runnable {

	private int delay;
	private Thread thread;

	public RunnableThread(int delay) {
		super();
		this.delay = delay;
		this.thread = new Thread(this);
		thread.start();
	}

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
				Thread.sleep(delay);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
