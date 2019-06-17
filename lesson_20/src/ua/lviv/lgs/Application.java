package ua.lviv.lgs;

public class Application {
	public static void main(String[] args) throws InterruptedException {
		MyThread myThread = new MyThread(1000);
		myThread.start();
		
//		RunnableThread runnableThread = new RunnableThread(1000);
		
		}

}
