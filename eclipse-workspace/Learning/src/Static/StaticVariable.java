package Static;

public class StaticVariable {
	static int num1=100;
	int num2;
	String num3;
	public static void main(String[]args)
	{
		StaticVariable obj1 = new StaticVariable();
		StaticVariable obj2 = new StaticVariable();

	obj1.num1 =99;
	obj1.num3 = "This is my obj1";
	
	obj2.num2 =111;
	obj2.num3 ="This is my obj2";
	System.out.println("The Value of first obj:"+obj1.num1);
	System.out.println("The Value of first obj:"+obj1.num3);
	System.out.println("The Value of first obj:"+obj2.num2);
	System.out.println("The Value of first obj:"+obj2.num3);
}
}
