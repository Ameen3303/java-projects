package java_with_DSA;
class Calculator
{
	int calculate(int a ,int b)
	{
		return a+b;
	}
	int calculate(int a ,int b,int c)
	{
		return a*b*c;
	}
	double calculate(double a,double b)
	{
		return a*b;
	}
	
}




public class OverlodingExample {

	public static void main(String[] args) {
		Calculator calc=new Calculator();
		System.out.println(calc.calculate(10,20));
		System.out.println(calc.calculate(10,20,30));
		System.out.println(calc.calculate(10.5,20.5));



	}

}//methodoverloding means having multiple methods with the same name
//but different pararmeters in the same class
