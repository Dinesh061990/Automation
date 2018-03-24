package constructor;

public class Constructor {
int id;
String StudentName;

Constructor(int num , String name)
{
	this.id =num;
	this.StudentName=name;
}
void info() {
	System.out.println("num :" +id + " sname:" + StudentName );
}
public static void main(String[] args)
{
Constructor obj = new Constructor(10566,"Shahul");	
Constructor obj1 = new Constructor(10955,"Ragu");
Constructor obj2 = new Constructor(54545,"Guru");
obj.info();
obj1.info();
obj2.info();
}
}
