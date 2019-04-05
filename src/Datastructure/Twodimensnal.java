package Datastructure;

import java.util.Scanner;

public class Twodimensnal {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the row");
		int row=s.nextInt();
		System.out.println("Enter the column");
		int col=s.nextInt();
		int arr[][]=new int[row][col];
		int arr1[][]=new int[row][col];
		for (int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
		{
				System.out.println("Enter the dimensions"+i+" "+j);	
				arr[i][j]=s.nextInt();
		}
		}
		for (int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
		{
				System.out.println("Enter the dimensions"+i+" "+j);	
				arr1[i][j]=s.nextInt();
		}
		}
		int arr3[][]=new int[row][col];
		for (int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
		{	
				arr3[i][j]=arr[i][j]+arr1[i][j];
		}
		// TODO Auto-generated method stub
			}
		for (int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
		{	
				System.out.println(arr3[i][j]);
		}
	}
}
}
