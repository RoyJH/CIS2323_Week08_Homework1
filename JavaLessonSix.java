// java.lang.RunTimeException	Checked by you: Your resonsible for these

// java.lang.Exception		Checked by compliler: Will prevent program from running

// AritmeticException
// ClassNotFoundException
// IllegalArgumentException
// IndexOutOfBounds
// InputMismatchException
// IOException

public class JavaLessonSix{
	
	public static void main (String[] args){
		
		divideByZero(2);
		
	}
	
	public static void divideByZero(int a){
		
		try
		{
			System.out.println(a/0);
		}
		catch (ArithmeticException e)
		{
			System.out.println("You can't do that.");
			
			System.out.println(e.getMessage());
			
			System.out.println(e.toString());
			
			e.printStackTrace();
		}
		
	}
	
}