import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class CollegeTest {

	public static void main(String[] args) {
		ApplicationContext co=new ClassPathXmlApplicationContext("Spring.xml");
		College college=(College)co.getBean("college");
		System.out.println(college);
		College college1=(College)co.getBean("college1");
		System.out.println(college1);
		
	//	This inner bean also supported in constructor injection as following :
		College college2=(College)co.getBean("college2");
		System.out.println(college2);	
		
		//alias example as
		College college3=(College)co.getBean("college3");
		System.out.println(college3);	
		
	}

}
