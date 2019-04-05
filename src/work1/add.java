package work1;

public abstract class add {
	public static void main(String args[]){
		int a=121;
		int b=121;
		int temp=0;
		int res=0;
		while(a>0)
		{
			temp=a%10;
			res=(res*10)+temp;
			a=a/10;
		}
		//System.out.println(res);
		//int n=res;
		//System.out.println(n);
		if(res==b)
		{
			System.out.println("armst");
		}
		else
			System.out.println("no");
			}
	

}
