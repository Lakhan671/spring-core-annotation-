
public class Employee {
	private int id;
	private String depName;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDepName() {
		return depName;
	}
	public void setDepName(String depName) {
		this.depName = depName;
	}
	
	public void empDisplay() {
		System.out.println("Employee [id=" + id + ", depName=" + depName + "]");
	}
	

}
