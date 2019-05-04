package pkg.core.examples;

import java.util.ArrayList;

public class ForLoopExample {

	public static void main(String[] args){
		ArrayList<String> list=new ArrayList<String>();//Creating arraylist    
	      list.add("Ravi");//Adding object in arraylist    
	      list.add("Vijay");    
	      list.add("Ravi");    
	      list.add("Ajay");    
	      //Invoking arraylist object   
	      System.out.println(list);
	      
	      //loop will start from 0 to <=4 total iteration=5
	    
	      try{
	      
	      for(int i=0; i<list.size();i++){
	    	  System.out.println("Value in Arraylist at position: "+i+" is :" + list.get(i));
	    	  
	      }
		
	      }catch(IndexOutOfBoundsException ex){
	    	 System.out.println("For loop iterated more than the length:");
	      }
		
	}
	
}
