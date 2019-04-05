package Datastructure;

public class Theradtest implements Runnable{

	public static void main(String[] args) {
		Theradtest m=new Theradtest();
		Thread t=new Thread(m);
		t.start();
		
		}
	public void run()
	{
		for(int i=0;i<10;i++)
		{
		System.out.println(i);
		}
		for(int j=10;j>=0;j--)
		{
			System.out.println(j);
		}
	}

}
