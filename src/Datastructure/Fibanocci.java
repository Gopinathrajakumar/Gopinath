package Datastructure;

public class Fibanocci {

	public static void main(String[] args) {
		int a=0;
		int b=1;
		int sum;
		for (int i=1;i<=37;i++)
		{
			System.out.println(a);
			sum=a+b;
			a=b;
			b=sum;
			
		}
		// TODO Auto-generated method stub

	}

}
