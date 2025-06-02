package java_with_DSA;


class Mytask extends Thread
{
	private String taskName;
	
	public Mytask(String taskName)
	{
		this.taskName=getName();
	}
	public void run()
	{
		for(int i=1;i<=5;i++)
		{
			System.out.println(taskName+"Steps"+i);
			try {
				Thread.sleep(5000);
			}
			catch(InterruptedException e)
			{
				System.out.println(taskName+"was interrupted");
			}
		}
	}
}

public class SimpleConcurrency {

	public static void main(String[] args) {
		Mytask t1=new Mytask("coocking");
		Mytask t2=new Mytask("washing");
		
		t1.start();
		t2.start();
		

	}

}


//This:- 