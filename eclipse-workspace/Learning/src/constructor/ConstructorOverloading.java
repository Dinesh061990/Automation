package constructor;

public class ConstructorOverloading {
	int id;
	String name;
		ConstructorOverloading(int identificationNo ,String Student)
		{
			this.id = identificationNo;
					this.name =Student;
			
		}
void info()
{
	System.out.println("IdentificationNo  :"+ id  + " Student : " +name);
} 
public static void main(String[]args)
{
	ConstructorOverloading obj = new ConstructorOverloading (101,"Dinesh");
	ConstructorOverloading obj1 = new ConstructorOverloading (102,"Shahul");
	ConstructorOverloading obj2 = new ConstructorOverloading (103,"Nanda");
	obj.info();
	obj1.info();
	obj2.info();
}
	
}