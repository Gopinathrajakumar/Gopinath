package Work2;

import java.util.Scanner;

public class Exception2 {

	public static void main(String[] args) {
		System.out.println("enter the page number");
		Scanner S=new Scanner(System.in);
		int b=S.nextInt();
		int b1[]={1,2,3,4,5,6,7,8,9,10};
		for (int i=0;i<=b1.length;i++)
		{
			if(b<10)
			{
				System.out.println(i);
			}
			
		}
		System.out.println("the available pages are 10");
		if(b>10)
		{
			System.out.println("impossible");
		}
	}

}
