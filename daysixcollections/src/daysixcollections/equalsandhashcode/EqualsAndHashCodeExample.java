package daysixcollections.equalsandhashcode;

public class EqualsAndHashCodeExample {

	public static void main(String[] args) {
			Employee emp1 = new Employee();
			Employee emp2 = new Employee();

			emp1.setEmpId(1);
			emp1.setEmpName("Ibrahim");
			emp1.setSalary(15000.50);
			
			
			emp2.setEmpId(1);
			emp2.setEmpName("Ibrahim");
			emp2.setSalary(15000.50);
			
			System.out.println(emp1.equals(emp2));
			System.out.println(emp1.hashCode());
			System.out.println(emp2.hashCode());
			
			Employee emp3 = new Employee();
			
			emp3.setEmpId(1);
			emp3.setEmpName("Raju");
			emp3.setSalary(1111111.50);
			
			System.out.println(emp1.equals(emp3));
			System.out.println(emp1.hashCode());
			System.out.println(emp3.hashCode());
	}

}
