package java_with_DSA;


class Car2 implements Runnable
{
	public void run()
	{
		for(int i=1;i<=3;i++)
		{
			System.out.println("BMW car moving"+i);	
			try {
				Thread.sleep(500);
			}
			catch(Exception e)
			{
				
			}
		}
	}
}

class Bike3 implements Runnable
{
	public void run()
	{
		for(int i=1;i<=3;i++)
		{
			System.out.println("ninja bike moving"+i);	
			try {
				Thread.sleep(500);
			}
			catch(Exception e)
			{
				
			}
		}
	}
}


public class ThreadExample2 {
	public static void main(String[] args) {
		Thread caThread=new Thread(new Car2());
		Thread baThread=new Thread(new Bike3());
		System.out.println("Goo");

		caThread.start();
		baThread.start();
		
	}

}
