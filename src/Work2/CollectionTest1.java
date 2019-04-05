package Work2;

import java.util.HashSet;
import java.util.Scanner;

public class CollectionTest1 {

	public static void main(String[] args) {
		System.out.println("Enter the data");
		Scanner s=new Scanner(System.in);
		String b=s.nextLine();
		//System.out.println(b);
		for (int i=0;i<b.length()-1;i++)
		{
			if(b.charAt(i)==b.charAt(i+1))
			{
				System.out.println(b.charAt(i));
			}
		}
		// TODO Auto-generated method stub

	}

}
