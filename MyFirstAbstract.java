package pkg.core.examples;

public abstract class MyFirstAbstract {
	public abstract Integer addMethod(int x, int y);
	public abstract Integer multiplication(int x, int y);
	
    public int substraction(int x, int y){

        int result=x-y;
        System.out.println("addition of x and y:"+result);
        return result;
    }

	
}
