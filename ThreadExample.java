package java_with_DSA;
class Car1 extends Thread
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

class Bike2 extends Thread
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


public class ThreadExample {
	public static void main(String[] args) {
		new Car1().start();
		new Bike2().start();

	}

}
