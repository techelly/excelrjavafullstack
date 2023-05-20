package dayfour.finalexample;

public final class Student {
	private Integer studentId;
	private String name;
	/**
	 * 
	 */
	public Student() {
		// TODO Auto-generated constructor stub
	}
	/**
	 * @param studentId
	 * @param name
	 */
	public Student(Integer studentId, String name) {
		this.studentId = studentId;
		this.name = name;
	}
	public Integer getStudentId() {
		return studentId;
	}
	public void setStudentId(Integer studentId) {
		this.studentId = studentId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", name=" + name + "]";
	}
	
}
