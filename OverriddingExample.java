package java_with_DSA;

class Animal{
	void sound()
	{
		System.out.println("it says sound");
	}
}

class cat extends Animal
{
	void sound()
	{
		System.out.println("cat meows");
	}
}
class dog extends Animal
{
	void sound()
	{
		System.out.println("dog barcks");
	}
}



public class OverriddingExample {

	public static void main(String[] args) {
		Animal A=new Animal();
		cat c=new cat();
		dog d=new dog();
		A.sound();
		c.sound();
		d.sound();
		

	}

}
