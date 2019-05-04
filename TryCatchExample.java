package pkg.core.examples;

public class TryCatchExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			// created connection pool here 
			int a = 10;
			int b = 2;
			int c = 1;
			//connecting with DB retreiving records from DATABASE.
			
			String s="T";
			a = a / b;     //Arithmetic Exception
			System.out.println("After a divided by b: Value of a is :"+a);
			System.out.println(s.equalsIgnoreCase("S"));    //NPE
			
			b = b / c;
			System.out.println("After b divided by c: Value of b is :"+b);
			
			
			
			
		}catch (NullPointerException npe) {
			System.out.println("caught Null Pointer");
		}
		catch (ArithmeticException ae) {
			System.out.println("Denominator should be non zero values");
		}
		
		catch(Exception ex){
			ex.toString();
		}
		finally {
			System.out.println("I am in finally block");
			
			//Release the connection here 
		}
	}
}