package Datastructure;

public class Arraytest {

	public static void main(String[] args) {
		int a[]={5,6,5,3,2,6,8,5};
		for (int i=0;i<a.length;i++)
		{
			int count=0;
			for (int j=0;j<a.length;j++)
			{
				if(a[i]==a[j])
				{
					count++;	
				}
			}
			if(count>1)
			{
				System.out.println(a[i] +"-->"+count);
			}
		}
		// TODO Auto-generated method stub

	}

}
