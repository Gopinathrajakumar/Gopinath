package work1;

public class Dynamicbinding
{

	public static void main(String[] args) {
	bank LVB=new  bank();
	LVB.valid(new cardvalidation());
	LVB.valid(new pinvalidation());
	}	
}


class cardvalidation
{
	
	void add(int a,int b)
	{
		System.out.println("welcome");
		System.out.println(a+b);
	}
}
class pinvalidation extends cardvalidation
{
	void add(int a,int b)
	{
		System.out.println("welcome to bank");
		System.out.println(a+b);
	}
}

class bank
{
	void valid(cardvalidation c)
	{
	c.add(5,6);
c.add(10, 10);
	}
}
