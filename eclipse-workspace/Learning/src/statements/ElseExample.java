package statements;

public class ElseExample 
    {
	public static void main(String[]args)
	    {
		String name = "Ganesh";
		String num ="123";
		
		if (name==num)
		{
			System.out.println("Values matched"); /*if values equals will print this statement */
		}
		else if(name!=num)
	    {
		System.out.println("Values are not similar"); /*if values are not similar will Print this statement*/
	    }
		else 
		{
			System.out.println("Please enter the strings to be matched" ); /*Given value is not a String */
		}
	}
    }