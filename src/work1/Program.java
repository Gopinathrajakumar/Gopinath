package work1;

class Fibanocci
{
	void fib(int a,int b)
	{
	for (int i=0;i<7;i++)
	{
		System.out.println(a);
		int num=a+b;
		b=a;
		a=num;
	}
	}
	void prime(int a,int b)
	{
		
			int c=a*b;
			System.out.println("hi");
	}
}
class primenumber extends Fibanocci
{
	void prime(int a,int b)
	{
		
			int c=a*b;
	}
	
}
class validation
{
	void validation(Fibanocci c)
	{
		c.prime(1,2);
		c.fib(0,1);
	}
	
}

public class Program {
	
	public static void main(String[] args) {
		validation LVB=new validation();
		LVB.validation(new primenumber());
		LVB.validation(new Fibanocci());
		// TODO Auto-generated method stub

	}

}
