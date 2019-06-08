
public class Student {
	private String name;
	private String address;
	private int pinNO;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getPinNO() {
		return pinNO;
	}
	public void setPinNO(int pinNO) {
		this.pinNO = pinNO;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", address=" + address + ", pinNO="
				+ pinNO + "]";
	}
	

}
