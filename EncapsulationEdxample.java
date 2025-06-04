package java_with_DSA;


class Student1{
	private String name;
	private int rollno;
	private int marks;
	
	
	public String getName() 
	{
		return name;
	}
	public void setName(String name) 
	{
		this.name = name;
	}
	
	
	public int getRollno()
	{
		return rollno;
	}
	
	
	public void setRollno(int rollno)
	{
		this.rollno = rollno;
	}
	
	
	public int getMarks()
	{
		return marks;
	}
	
	
	public void setMarks(int marks)
	{
		this.marks = marks;
	}
	
	public String Checkresult()
	{
		if (getMarks() >= 40)
		{
			return "Pass";
		}
		else 
		{
			return "Fail";
		}
	}
	
	public void display() {
		System.out.println("Name is:"+getName());
		System.out.println("roll number is:"+getRollno());
		System.out.println("marks is:"+getMarks());
		System.out.println("check the result:"+Checkresult());

	}
	
	
}




public class EncapsulationEdxample {

	public static void main(String[] args) {

		Student1 stu=new Student1();
		stu.setName("Ameen");
		stu.setRollno(3303);
		stu.setMarks(35);
		stu.display();
		String s=stu.Checkresult();
		System.out.println(s);
	}

}
