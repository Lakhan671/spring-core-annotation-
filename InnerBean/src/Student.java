
public class Student {
	private String name;
	private int rollno;
	private String barnc;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getBarnc() {
		return barnc;
	}
	public void setBarnc(String barnc) {
		this.barnc = barnc;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", rollno=" + rollno + ", barnc="
				+ barnc + "]";
	}
	

}
