import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class MainAPPlication {

	public static void main(String[] args) {
		ApplicationContext co=new AnnotationConfigApplicationContext(HelloWordConfig.class);
		HelloWord helloword=co.getBean(HelloWord.class);
		helloword.setMessage("My name is lakhan singh");
		System.out.println(helloword);
		

	}

}
