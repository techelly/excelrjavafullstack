package daysixcollections.equalsandhashcode;

import java.util.Objects;

public class Employee {
	private Integer empId;
	private String empName;
	private Double salary;
	/**
	 * 
	 */
	public Employee() {
		// TODO Auto-generated constructor stub
	}
	/**
	 * @param empId
	 * @param empName
	 * @param salary
	 */
	public Employee(Integer empId, String empName, Double salary) {
		this.empId = empId;
		this.empName = empName;
		this.salary = salary;
	}
	public Integer getEmpId() {
		return empId;
	}
	public void setEmpId(Integer empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public Double getSalary() {
		return salary;
	}
	public void setSalary(Double salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", salary=" + salary + "]";
	}
	/**
	@Override
	public int hashCode() {
		return Objects.hash(empId, empName, salary);
	}**/
	/**
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return Objects.equals(empId, other.empId) && Objects.equals(empName, other.empName)
				&& Objects.equals(salary, other.salary);
	}*/
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return (other.getEmpId() == this.getEmpId());
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(empId);
	}
}
