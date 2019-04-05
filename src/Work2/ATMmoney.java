package Work2;

import java.io.IOException;
import java.util.Scanner;

public class ATMmoney {

	private static boolean isMenuActive = true;
	private static int twoThousand = 0;
	private static int fiveHundred = 0;
	private static int twoHundred = 0;
	private static int oneHundred = 0;
//private static int amount=0;
	public static void main(String args[]) throws IOException {
		while(isMenuActive ){
			mainMenu();
		}
	}

	private static void mainMenu() {
		System.out.println("Menu");
		System.out.println("1.Deposit");
		System.out.println("2.Withdraw");
		System.out.println("3.Show balance details in ATM");
		System.out.println("4.Exit");
		System.out.println("Please enter your choice:");
		Scanner s = new Scanner(System.in);
		Integer b = (Integer) s.nextInt();
		switch (b.toString()) {
		case "1":
			depositMoney();
			break;
		case "2":
			withdraw();
			break;
		case "3":
			showBalanceDenominations();
			break;
		case "4":
			isMenuActive = false;
			System.out.println("Thanks for using the ATM");
			break;
		}
	}

	private static void depositMoney() {
		System.out.println("Enter the amount you have to deposit");
		Scanner s1 = new Scanner(System.in);
		int b1 =s1.nextInt();
		
		int c=b1/2000;
		System.out.println("Number of 2000 rupees notes "+c+ " ----2000 * " +c+ " = " +c*2000);
		twoThousand = twoThousand  + c;
		int d=b1%2000; 
		int e=d/500;
		System.out.println("Number of 500 rupees notes "+e+ " ------500 * " +e+ " = " +e*500);
		fiveHundred = fiveHundred  + e;
		int f=d%500;
		int g=f/200;
		System.out.println("Number of 200 rupees notes  "+g+ " ------200 * " +g+ " = " +g*200);
		twoHundred = twoHundred  + g;
		int h=f%200;
		int i=h/100;
		System.out.println("Number of 100 rupees notes "+i+ " ------100 * " +i+ " = " +i*100);
		oneHundred = oneHundred + i;
		
		System.out.println("Total amount deposited ----------"+b1);
//			Runtime.getRuntime().exec("cls");
	}

	private static void showBalanceDenominations() {
		System.out.println("Balance denominations available:");
		System.out.println("Number of 2000 rupees notes "+twoThousand+ " ----2000 * " +twoThousand+ " = " +twoThousand*2000);
		System.out.println("Number of 500 rupees notes "+fiveHundred+ " ------500 * " +fiveHundred+ " = " +fiveHundred*500);
		System.out.println("Number of 200 rupees notes  "+twoHundred+ " ------200 * " +twoHundred+ " = " +twoHundred*200);
		System.out.println("Number of 100 rupees notes "+oneHundred+ " ------100 * " +oneHundred+ " = " +oneHundred*100);
		//TODO: Print the total
		//System.out.print(amount);
		System.out.println("**********End*********");
	}

	private static void withdraw() {
		// TODO Auto-generated method stub
		
	}


}
