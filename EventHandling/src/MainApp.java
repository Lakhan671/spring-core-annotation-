import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class MainApp {
	public static void main(String[] args) {
		ConfigurableApplicationContext co=new ClassPathXmlApplicationContext("Spring.xml");
		co.start();
		HelloWord hell=(HelloWord)co.getBean("helloword");
		System.out.println(hell);
		co.stop();
		
	}

}
