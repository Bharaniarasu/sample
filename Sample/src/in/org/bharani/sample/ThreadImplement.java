package in.org.bharani.sample;

public class ThreadImplement implements Runnable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i = 0; i < 5; i++) {
			try {
				Thread.sleep(10000);
			} catch (InterruptedException ie) {
				System.out.println("Exception occures");
			}
			System.out.println("welcome all");
		}
	}

}
