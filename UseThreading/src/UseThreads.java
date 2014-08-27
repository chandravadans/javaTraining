
class PrinterThread implements Runnable
{

	int count =42;

	boolean myTurn=true;

	@Override
	public synchronized void run()
	{

		long threadID = Thread.currentThread().getId();
		while(true){
			if(myTurn){
				count++;
				myTurn=false;
				notify();
			}
			else{
				try
				{
					wait();
					myTurn=true;
					notify();
				} catch (InterruptedException e)
				{
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}

			System.out.println("Thread " + threadID + "printing  count " + count);
			try
			{
				Thread.sleep(1000);
			} 
			catch (InterruptedException e)
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
	}

}

public class UseThreads
{

	public static void main(String[] args)
	{
		PrinterThread printerThread = new PrinterThread();

		Thread thread1 = new Thread(printerThread);
		thread1.start(); // makes the thread1 ready to run

		Thread thread2 = new Thread(printerThread);
		thread2.start(); // makes the thread2 ready to run

	}

}
