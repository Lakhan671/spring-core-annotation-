import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ApplicationContext co=new ClassPathXmlApplicationContext("Spring.xml");
Student st=(Student)co.getBean("student");
st.displayStudent();

	}

}
