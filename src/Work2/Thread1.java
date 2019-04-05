package Work2;

public class Thread1 extends Thread {
		public void run()
		{
			System.out.println("Start");
		}
	public static void main(String[] args) {
		System.out.println("hello");
		Thread1 p=new Thread1();
		p.start();
		try {
			Thread.sleep(5000);
		}
		catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("end");
				// TODO Auto-generated method stub

	}

}
