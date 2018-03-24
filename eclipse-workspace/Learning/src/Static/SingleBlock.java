package Static;

public class SingleBlock {
static int num;
static String Var;

	static
	{
	num =10;
	Var="Testing";
}
public static void main(String[]args)
{
	System.out.println("Get the Static value :" +num);
	System.out.println("Get the Static Variable:"+Var);
}
}
