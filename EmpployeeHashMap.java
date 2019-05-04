package pkg.core.examples;

import java.util.HashMap;
import java.util.Map;

public class EmpployeeHashMap {

	
	//setting Employee Data
	public HashMap<String,EmployeeVO> setData(){
		
		HashMap<String,EmployeeVO> empMap=new HashMap<String,EmployeeVO>();
		
		System.out.println("empMap  -- isEmpty:"+empMap.isEmpty());  //true
		
		EmployeeVO e1=new EmployeeVO();
		e1.setEmployeeFirstName("Ali");
		e1.setEmployeeLastName("Shah");
		e1.setEmployeeEmail("ali@gmail.com");
		e1.setEmployeeId("ali00001");
		e1.setEmployeeMobileNo("+6590620611");
		e1.setEmployeeAddr("Pasir Ris");
		e1.setEmployeeSalary(100000.00);
		
		empMap.put(e1.getEmployeeId(),e1);
				
		EmployeeVO e2=new EmployeeVO();
		e2.setEmployeeFirstName("Manish");
		e2.setEmployeeLastName("Shukla");
		e2.setEmployeeEmail("manishshukla@gmail.com");
		e2.setEmployeeId("man00002");
		e2.setEmployeeMobileNo("+6590620648");
		e2.setEmployeeAddr("Robinson Road");
		e2.setEmployeeSalary(100022.00);
		
		
		empMap.put(e2.getEmployeeId(),e2);
		
		EmployeeVO e3=new EmployeeVO();
		e3.setEmployeeFirstName("Bob");
		e3.setEmployeeLastName("Storey");
		e3.setEmployeeEmail("Bob@gmail.com");
		e3.setEmployeeId("bob00003");
		e3.setEmployeeMobileNo("+6598503509");
		e3.setEmployeeAddr("Bukit imah");
		e3.setEmployeeSalary(200000.00);
		
		empMap.put(e3.getEmployeeId(),e3);
		
		//empMap.put(e1.getEmployeeId(),e1);      since key is same as first record. it will override the record. No error will be thrown here
		//empMap.put(e1.getEmployeeEmail(),e1);    here it will same record(e1) with given key because key is unique not like ali00001. 
		
		//empMap.remove(0);
		
	
		
		System.out.println("empMap  -- isEmpty:"+empMap.isEmpty());  // false
		
		
		return empMap;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EmpployeeHashMap empHashMap=new EmpployeeHashMap();
		HashMap<String,EmployeeVO> empMap=empHashMap.setData();
		
		
		for (Map.Entry<String, EmployeeVO> entry : empMap.entrySet()) {
			EmployeeVO employee=entry.getValue();
			System.out.println(entry.getKey() + " = " + employee.getEmployeeFirstName()+ " , " + employee.getEmployeeLastName());
		}

	}

}
