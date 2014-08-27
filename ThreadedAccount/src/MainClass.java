class Withdrawer implements Runnable{

	@Override
	public void run()
	{
		MainClass.sampleAccount.withdraw(200);

	}
}

class Depositor implements Runnable{

	@Override
	public void run()
	{
		for(int i=0;i<9;i++){
			try
			{
				Thread.sleep(1000);
			} catch (InterruptedException e)
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			MainClass.sampleAccount.deposit(30);
		}

	}

}
public class MainClass
{
	public static Account sampleAccount=new Account(0);

	public static void main(String[] args) throws InterruptedException
	{		
		Thread withdrawerThread=new Thread(new Withdrawer());
		withdrawerThread.start();

		Thread depositorThread=new Thread(new Depositor());
		depositorThread.start();

		//Thread.sleep(1000);



	}	
}