package daytwo.classes;

import java.time.LocalDate;

public class MainClass {

	public static void main(String[] args) {
		Employee emp1 = new Employee();
		Employee emp2 = new Employee(15,"Rahul","Gandhi",LocalDate.of(2000, 11, 10),9988776655L,15234343.54);
		Employee emp3 = new Employee(11,"Priyanka","Gandhi");
		System.out.println(emp1);
		System.out.println(emp2);
		System.out.println(emp3);
		//Employee emp3 = new Employee(11,"Priyanka","Gandhi",LocalDate.of(2000, 12, 21));
		
		emp3.setDateOfBirth(LocalDate.of(2000, 12, 21));
		emp3.setMobileNumber(9988776656L);
		emp3.setSalary(15234343);
		
		Department dept = new Department();
		dept.setDeptId(1);
		dept.setDeptName("IT");
		
		
		Department dept1 = new Department();
		dept1.setDeptId(2);
		dept1.setDeptName("Finance");
		
		Address resAddr= new Address();
		resAddr.setAddressId(1);
		resAddr.setHouseNo(1511);
		resAddr.setCity("Bengaluru");
		resAddr.setStreet("BTM Layout");
		resAddr.setState("KA");
		resAddr.setCountry("IN");
		
		System.out.println(dept);
		System.out.println(dept1);
		System.out.println(resAddr);
		
		emp3.setAddress(resAddr);
		emp3.setDepartment(dept1);
		
		System.out.println(emp3);

	}

}
