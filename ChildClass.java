package pkg.core.examples;


public class ChildClass extends ParentClass{

	public void methodClass(String s1){
		System.out.println("I am in overloaded method"+s1);
	}
	
	public void methodClass(String s1, Integer s2){
		System.out.println("I am in o  v y7erridden method:"+s1+s2);
	}
	
	public static void main(String[] args){
		int i=3;
		int j=2;
		String s="Ali";
		System.out.println(i+s);
		System.out.println(i+j+s);
		System.out.println(i+s+j);
		System.out.println(s+i+j);
	}
	
}