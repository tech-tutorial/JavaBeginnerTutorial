package pkg.core.examples;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class EmpployeeArrayList {

	
	//setting Employee Data
	public ArrayList<EmployeeVO> setData(){
		
		ArrayList<EmployeeVO> empList=new ArrayList<EmployeeVO>();
		
		System.out.println("empList  -- isEmpty:"+empList.isEmpty());  //true
		
		EmployeeVO e1=new EmployeeVO();
		e1.setEmployeeFirstName("Ali");
		e1.setEmployeeLastName("Shah");
		e1.setEmployeeEmail("ali@gmail.com");
		e1.setEmployeeId("ali00001");
		e1.setEmployeeMobileNo("+6590620611");
		e1.setEmployeeAddr("Pasir Ris");
		e1.setEmployeeSalary(100000.00);
		
		empList.add(e1);
				
		EmployeeVO e2=new EmployeeVO();
		e2.setEmployeeFirstName("Manish");
		e2.setEmployeeLastName("Shukla");
		e2.setEmployeeEmail("manishshukla@gmail.com");
		e2.setEmployeeId("man00002");
		e2.setEmployeeMobileNo("+6590620648");
		e2.setEmployeeAddr("Robinson Road");
		e2.setEmployeeSalary(100022.00);
		
		
		empList.add(e2);
		
		EmployeeVO e3=new EmployeeVO();
		e3.setEmployeeFirstName("Bob");
		e3.setEmployeeLastName("Storey");
		e3.setEmployeeEmail("Bob@gmail.com");
		e3.setEmployeeId("bob00003");
		e3.setEmployeeMobileNo("+6598503509");
		e3.setEmployeeAddr("Bukit imah");
		e3.setEmployeeSalary(200000.00);
		
		empList.add(e3);
		
		empList.add(e1);
		
		//empList.remove(0);
		
	
		
		System.out.println("empList  -- isEmpty:"+empList.isEmpty());  // false
		
		
		return empList;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EmpployeeArrayList empployeeArrayList=new EmpployeeArrayList();
		ArrayList<EmployeeVO> empList=empployeeArrayList.setData();
		
		for (int i = 0; i < empList.size(); i++) {        //empList.size()=2 because we have added two objects of type EmployeeVO in list
			EmployeeVO emp=empList.get(i);
		
			System.out.println("Employee Data: Employee ID-"+emp.getEmployeeId());
			System.out.println("Employee Data: First Name-"+emp.getEmployeeFirstName());
			System.out.println("Employee Data: Last Name-"+emp.getEmployeeLastName());
			System.out.println("Employee Data: Address-"+emp.getEmployeeAddr());
			System.out.println("Employee Data: Mobile No-"+emp.getEmployeeMobileNo());

		}

	}

}
