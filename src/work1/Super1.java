package work1;

public class Super1 extends Super2
{

	public static void main(String[] args) {
		Super1 S=new Super1(7);
	}
	 Super1(int c)
	{
		 super(5,6);
		System.out.println(c);
	}
		
}

class Super2
{
	public static void main(String args[]){
		
	}
	Super2(int a,int b)
	{
		System.out.println(a+b);
	}
	
}
