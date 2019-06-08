
public class DepartMent {
	private String dName;
	private int id;
	public String getdName() {
		return dName;
	}
	public void setdName(String dName) {
		this.dName = dName;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void destroy(){
		System.out.println("Bean going through to destroy");
	}
	public void init(){
		System.out.println("Bean going through to init");
	}
	
	
	@Override
	public String toString() {
		return "DepartMent [dName=" + dName + ", id=" + id + "]";
	}
	
	

}
