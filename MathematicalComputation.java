package pkg.core.examples;

public class MathematicalComputation{

	public Integer addMethod(int x, int y){

	     int result=x+y;
	     System.out.println("addition of x and y:"+result);
	     return result;
	 }

	    public int multiplication(int x, int y){

	        int result=x*y;
	        System.out.println("addition of x and y:"+result);
	        return result;

	    }

	    public int substraction(int x, int y){

	        int result=x-y;
	        System.out.println("addition of x and y:"+result);
	        return result;
	    }
	
	    
	    public static void main(String[] args){
	    	MathematicalComputation mc=new MathematicalComputation();
	    	int result=mc.addMethod(6, 7);
	    	System.out.println("inside main:"+result);
	    	
	    }
	
}
