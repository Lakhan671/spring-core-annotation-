
public class Employee {
private String name;
private String loc;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getLoc() {
	return loc;
}
public void setLoc(String loc) {
	this.loc = loc;
}
public void employeeDisplay(){
	System.out.println("name:"+name);
	System.out.println("loc:"+loc);
}

}
