
public class Account
{
	int balance;
	
	public Account(int initialBalance)
	{
		balance=initialBalance;

	}
	
	public synchronized void withdraw(int amount){
		int waitctr = 0;
		while(balance < amount){
			try
			{
				System.out.println("waiting for sufficient balance for "+(waitctr++)+" times!");
				
				wait();
				
			} catch (Exception e)
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		balance-=amount;
		System.out.println("Phew! sufficient balance available! New balance= "+balance);
		
			
	}
	
	public synchronized void deposit(int amount){
		
		balance+=amount;
		System.out.println("Deposited "+amount+". New balance is "+balance+"!");
		notify();
	}

}
