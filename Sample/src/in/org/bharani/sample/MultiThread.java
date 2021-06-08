package in.org.bharani.sample;

public class MultiThread extends Thread {
	public static void main(String args[]) {

	}

	public void run() {

		for (int i = 0; i < 5; i++) {
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("hello vankkam");
		}

	}
}
