package java_with_DSA;

public class PriorityProgram {

	public static void main(String[] args) {
		
		Thread lowPrioritythread=new Thread();
		for(int i=1;i<=5;i++)
		{
			System.out.println("low priority thread" + i);
		}
		Thread HighPrioritythread=new Thread();
		for(int i=1;i<=5;i++)
		{
			System.out.println("high priority thread" + i);
		}
		


	}
	

}
