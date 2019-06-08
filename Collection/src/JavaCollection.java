import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;


public class JavaCollection {
	List addresList;
	Set  addressSet;
	Map addressMap;
	Properties addressProperties;
	public List getAddresList() {
		return addresList;
	}
	public void setAddresList(List addresList) {
		this.addresList = addresList;
	}
	public Set getAddressSet() {
		return addressSet;
	}
	public void setAddressSet(Set addressSet) {
		this.addressSet = addressSet;
	}
	public Map getAddressMap() {
		return addressMap;
	}
	public void setAddressMap(Map addressMap) {
		this.addressMap = addressMap;
	}
	public Properties getAddressProperties() {
		return addressProperties;
	}
	public void setAddressProperties(Properties addressProperties) {
		this.addressProperties = addressProperties;
	}
	@Override
	public String toString() {
		return "JavaCollection [addresList=" + addresList + ", addressSet="
				+ addressSet + ", addressMap=" + addressMap
				+ ", addressProperties=" + addressProperties + "]";
	}
	
	

}
