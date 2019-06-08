
public class College {
	private Student student;
	private String collegeName;
	public College(){}
	
	public College(Student student, String collegeName) {
		super();
		this.student = student;
		this.collegeName = collegeName;
	}
	public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		this.student = student;
	}
	public String getCollegeName() {
		return collegeName;
	}
	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}
	@Override
	public String toString() {
		return "College [student=" + student + ", collegeName=" + collegeName
				+ "]";
	}
	
	
	

}
