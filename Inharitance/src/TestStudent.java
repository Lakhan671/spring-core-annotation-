import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class TestStudent {
	public static void main(String[] args) {
		ApplicationContext co=new ClassPathXmlApplicationContext("Spring.xml");
		Student st=(Student)co.getBean("student");
		System.out.println(st);
		//st.empDisplay();
		
	}

}
