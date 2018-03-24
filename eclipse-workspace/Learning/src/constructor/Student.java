package constructor;

public class Student {
int num;
String N;
Student (int number,String Name)
{
	num=number;
	N=Name;
}
Student (Student Se){
	{
	num =Se.num;
	N=Se.N;
	}
}
void info()
{
	System.out.println("Studentno :" +  num);
	System.out.println("name :" +  N);
}
public static void main(String[]args)
{
	Student obj=new Student(101,"Test");
	Student obj1=new Student(102,"Test1");
	obj.info();
	obj1.info();
}
}
