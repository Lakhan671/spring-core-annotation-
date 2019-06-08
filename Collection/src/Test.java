import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Test {
	public static void main(String[] args) {
		ApplicationContext co=new ClassPathXmlApplicationContext("Spring.xml");
		JavaCollection java=(JavaCollection)co.getBean("java");
		System.out.println(java);
	}

}
