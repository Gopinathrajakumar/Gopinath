package Work2;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.TreeSet;

public class CollectionTest {
	
	public static void main(String[] args) {
		System.out.println("enter the data");
		Scanner s=new Scanner(System.in);
		ArrayList k=new ArrayList();
		
		TreeSet n=new TreeSet();
		for (int i=0;i<3;i++)
		{
			 k.add(s.next());	 
		}
		System.out.println(k);
		n.addAll(k);
		System.out.println(n);
	}
}
