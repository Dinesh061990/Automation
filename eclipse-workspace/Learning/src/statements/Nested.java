package statements;

public class Nested {
	public static void main (String []args)
	{
		int num1 = 10;
		int num2 = 20;
		int num3 = 30;
		if(num1 >= num2)
		{
	    if(num1 >=num3)
		
		{
			System.out.println(num1 + " num1 is the Largest number" ); /*if num1 > =num2 this statement will be executed*/
		}else
		{
			System.out.println(num3 + " Num3 is the largest number");/*if num1 > =num3 this statement will be executed*/
		}
	}
	if(num2 <= num3)
	{
		System.out.println(num2 + " Num2 is smaller than the Num3");/*if num2 > =num3 this statement will be executed*/
	}else
	{
		System.out.println(num3+ "Num3 is the smallest");
	}
}
}
