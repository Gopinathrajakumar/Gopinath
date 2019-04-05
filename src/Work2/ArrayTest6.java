package Work2;

public class ArrayTest6 {

	public static void main(String[] args) {
		int a[]={8,7,6,5,7,3,1};
		for (int i=1;i<a.length;i++)
		{
			for (int j=0;j<a.length;j++)
			{
				if(a[i]==a[j])
				{
					System.out.println(a[i]);
					break;
			}
			}
		}
		// TODO Auto-generated method stub

	}

}
