package Datastructure;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

public class Collection5 {

	public static void main(String[] args) {
	//System.out.println("eEnter the name");
	//Scanner s=new Scanner(System.in);
		ArrayList al=new ArrayList();
		al.add("gopi");
		al.add("ashrar");
		al.add("gopi");
		al.add("gobi");
		al.add("sathis");
		al.add("hari");
		System.out.println(al);
		TreeSet tr=new TreeSet();
		for(int i=0;i<al.size();i++)
		{
			if(tr.add(al.get(i)))
			{
				System.out.println(al.get(i));
			}	
			
		}
		
		// TODO Auto-generated method stub

	}

}
