package arithmetic;

public class Static {
 static String name = "Phone no of the user"; /*instance variable */
	 public void method()
	 {
		String name = "Welcome user"; /*local Variable*/
		System.out.println(name);
	 }
	 public static void main(String[] args)  /*Static variable*/
	 {
		 
		 Static n = new Static();
		 String name = "Hi Everyone";
		 System.out.println("Hello");
	     n.method();
	     System.out.println(n.name);
		
	 }
 }
	
