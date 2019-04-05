package work1;

	
	 class Bank implements Atmprocess,Ecom
	{
	int a=15;
	int b=5;
	public static void main(String[] args) 
	{
		Bank B =new Bank();
		B.balance();
		B.withdaraw();
		B.pinvalid();
		B.doe();
	}
		 public void balance(int a,int b)
		{
			System.out.println(a+b);
		}
		public void withdaraw(int a,int b)
		{
			System.out.println(a-b);
		}
		public void pinvalid(int a,int b)
		{
			System.out.println(a*b);
		}
		public void  doe(int a,int b)
		{
			System.out.println("d");
		}
			
	}
	interface Atmprocess
	{
		void balance();
		void withdaraw();
	}
	interface Ecom
	{
		void pinvalid();
		void doe();	
	}
	