package in.org.bharani.sample;

public class ThreadControl {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ThreadImplement ti = new ThreadImplement();
		Thread t1 = new Thread(ti);
		t1.start();
		t1.join(3000);
		t1.setPriority(1);
		MultiThread mt = new MultiThread();
		mt.start();
	}

}
