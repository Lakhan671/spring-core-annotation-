package lakhan.org.hello;

public class Helloword {
	private String message;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public String toString() {
		return "Helloword [message=" + message + "]";
	}
	

}
