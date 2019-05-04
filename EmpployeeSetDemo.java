package pkg.core.examples;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class EmpployeeSetDemo {

	
	//setting Employee Data
	public HashSet<EmployeeVO> setData(){
		
		HashSet<EmployeeVO> empSet=new HashSet<EmployeeVO>();
		
		System.out.println("empSet  -- isEmpty:"+empSet.isEmpty());  //true
		
		EmployeeVO e1=new EmployeeVO();
		e1.setEmployeeFirstName("Ali");
		e1.setEmployeeLastName("Shah");
		e1.setEmployeeEmail("ali@gmail.com");
		e1.setEmployeeId("ali00001");
		e1.setEmployeeMobileNo("+6590620611");
		e1.setEmployeeAddr("Pasir Ris");
		e1.setEmployeeSalary(100000.00);
		
		empSet.add(e1);
				
		EmployeeVO e2=new EmployeeVO();
		e2.setEmployeeFirstName("Manish");
		e2.setEmployeeLastName("Shukla");
		e2.setEmployeeEmail("manishshukla@gmail.com");
		e2.setEmployeeId("man00002");
		e2.setEmployeeMobileNo("+6590620648");
		e2.setEmployeeAddr("Robinson Road");
		e2.setEmployeeSalary(100022.00);
		
		
		empSet.add(e2);
		
		EmployeeVO e3=new EmployeeVO();
		e3.setEmployeeFirstName("Bob");
		e3.setEmployeeLastName("Storey");
		e3.setEmployeeEmail("Bob@gmail.com");
		e3.setEmployeeId("bob00003");
		e3.setEmployeeMobileNo("+6598503509");
		e3.setEmployeeAddr("Bukit imah");
		e3.setEmployeeSalary(200000.00);
		
		empSet.add(e3);
		
		empSet.add(e1);
		
		//empSet.remove(0);
		
	
		
		System.out.println("empSet  -- isEmpty:"+empSet.isEmpty());  // false
		
		
		return empSet;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EmpployeeSetDemo empployeeArrayList=new EmpployeeSetDemo();
		HashSet<EmployeeVO> empSet=empployeeArrayList.setData();
		
		
		
		Iterator<EmployeeVO> i=empSet.iterator();  
        while(i.hasNext())  
        {  
        	EmployeeVO emp=i.next();
    		
			System.out.println("Employee Data: Employee ID-"+emp.getEmployeeId());
			System.out.println("Employee Data: First Name-"+emp.getEmployeeFirstName());
			System.out.println("Employee Data: Last Name-"+emp.getEmployeeLastName());
			System.out.println("Employee Data: Address-"+emp.getEmployeeAddr());
			System.out.println("Employee Data: Mobile No-"+emp.getEmployeeMobileNo());
        }  
			
	}

}
