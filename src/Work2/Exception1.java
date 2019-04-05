package Work2;

public class Exception1 {

	public static void main(String[] args) {
		int a,b,c;
		String num="5a";
		String num2="0";
		try
		{

			a=Integer.parseInt(num);
			b=Integer.parseInt(num2);
		 c=a/b;
			System.out.println(c);
		}catch(NumberFormatException e)
		{
			//num="5";
			a=5;
			b=5;
			c=a/b;
			System.out.println("handled "+c);
			//System.out.println();
		}catch(ArithmeticException n)
		{

		}
		System.out.println("hello");
		// TODO Auto-generated method stub

	}

}

