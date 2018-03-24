package learning;
public class Learning {
	
	public static String Myvarvalue = "Hi team";
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Learning obj=new Learning();
		Learning obj1=new Learning();
		Learning obj2=new Learning();
		
		System.out.println(obj.Myvarvalue);
		System.out.println(obj1.Myvarvalue);
		System.out.println(obj2.Myvarvalue);
      
       obj2.Myvarvalue= "Changed text";
      
       System.out.println(obj.Myvarvalue);
		System.out.println(obj1.Myvarvalue);
		System.out.println(obj2.Myvarvalue);
     
      
	}

}
