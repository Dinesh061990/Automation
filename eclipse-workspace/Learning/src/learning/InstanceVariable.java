package learning;
 

public class InstanceVariable {
	
	String Myvar = "hi team";
	
	public static void main(String [] args) 
	{
		InstanceVariable Obj= new InstanceVariable();
		InstanceVariable Obj1= new InstanceVariable();
		InstanceVariable Obj2 = new InstanceVariable();
		
		System.out.println(Obj.Myvar);
		System.out.println(Obj1.Myvar);
		System.out.println(Obj2.Myvar);
		
		Obj2.Myvar ="Changed Test";
		
		System.out.println(Obj.Myvar);
		System.out.println(Obj1.Myvar);
		System.out.println(Obj2.Myvar);
	}
}
