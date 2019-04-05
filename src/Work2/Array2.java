package Work2;

public class Array2 {

	public static void main(String[] args) {
		String a="payilagam";
		char b[]=a.toCharArray();
		char c=b[3];
		//System.out.println(c);
		for (int i=0;i<b.length;i++)
		{
			if (b[i]==c)
			{
				continue;
			}else
			{
				System.out.println(b[i]);
		
			}
		}
		
		
		// TODO Auto-generated method stub

	}

}
