package statements;

public class SampleExecise {
  public static int num1= 10;
  public static int num2= 20;
  public static int num3= 30;
 public static void main(String[]args)
 {
	 if(num1 > num2 && num2 < num3)
	 {
		 System.out.println("Statement First is true");
	 }else if (num1 > num3 && num3 < num1)
	 {
		 System.out.println(" Statement Second is true");
	 }else if (num3 > num1 && num3 > num2)
	 {
		 System.out.println(" Statement Third is true");
	 }else 
	 {
		 System.out.println("Values not matched");
	 }
 }
 

}
