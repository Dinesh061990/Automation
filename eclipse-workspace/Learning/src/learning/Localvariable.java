package learning;

public class Localvariable {
	
	
	/* Static variable has only one copy for all the methods in class while instance variable has
 many copy.
        Class can access only static variable while object can access both class and instance
 variable.   */
	
	/*Instance Variable*/
	 String Myvar = "HI Welcome to Instance";
	
	/*Local Variable */
	
	public void MyMethod ()
	{
		String Myvar = "local variable";
		System.out.println(Myvar);
	}
	/*Staticvariable*/
	
	public static void main (String[] args)
	{
		Localvariable obj= new Localvariable();
		System.out.println("calling method");
		obj.MyMethod();
		System.out.println(obj.Myvar);
	}

}
