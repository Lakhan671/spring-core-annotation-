
public class HelloWord {
	
private String message;

public String getMessage() {
	return message;
}

public void setMessage(String message) {
	this.message = message;
}

@Override
public String toString() {
	return "HelloWord [message=" + message + "]";
}

}
