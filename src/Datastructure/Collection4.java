package Datastructure;

import java.util.Scanner;
import java.util.TreeSet;

public class Collection4 {

	public static void main(String[] args) {
		System.out.println("enter the data");
		Scanner s=new Scanner(System.in);
		
		TreeSet c=new TreeSet();
		for(int i=0 ;; i++)
		{
			String b=s.nextLine();
			if(b.charAt(0)=='&')
			{
				break;
			}
			c.add(b);
		}
		System.out.println(c);
		// TODO Auto-generated method stub

	}

}
