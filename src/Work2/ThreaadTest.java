package Work2;

public class ThreaadTest {

	public static void main(String[] args) {
		cthread a=new cthread();
		bthread b=new bthread(a);
		athread a1=new athread(a);
		Thread obj=new Thread(b);

		Thread obj1=new Thread(a1); 
		obj.start();
		obj1.start();
		try {
			obj.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			obj1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(a.a);
	}
}
		class athread implements Runnable
		{
			cthread c1;
			athread(cthread c1)
			{
				this.c1=c1;
			}
			public void run()
			{for(int i=0;i<1000;i++)
			{
			c1.increment();
			}
			}
			}
		class bthread implements Runnable
		{
			cthread c2;
			bthread(cthread c2)
			{
				this.c2=c2;
				}
				public void run()
				{
					for(int i=0;i<1000;i++)
					{
					c2.increment();
					}
				}
		}
final class cthread
{
	int a;
	synchronized void increment()
	{
		
			a++;
		
	}
}
		// TODO Auto-generated method stub

	


