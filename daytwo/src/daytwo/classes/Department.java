package daytwo.classes;

public class Department {
	private int deptId;
	private String deptName;
	/**
	 * 
	 */
	public Department() {
		// TODO Auto-generated constructor stub
	}
	/**
	 * @param deptId
	 * @param deptName
	 */
	public Department(int deptId, String deptName) {
		this.deptId = deptId;
		this.deptName = deptName;
	}
	public int getDeptId() {
		return deptId;
	}
	public void setDeptId(int deptId) {
		this.deptId = deptId;
	}
	public String getDeptName() {
		return deptName;
	}
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	@Override
	public String toString() {
		return "Department [deptId=" + deptId + ", deptName=" + deptName + "]";
	}
	
	
}
