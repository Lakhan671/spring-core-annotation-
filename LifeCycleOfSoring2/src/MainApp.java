import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class MainApp {
public static void main(String[] arg){
	ApplicationContext co=new ClassPathXmlApplicationContext("Spring.xml");
	DepartMent d=(DepartMent)co.getBean("department");
	System.out.println(d);
}
}
