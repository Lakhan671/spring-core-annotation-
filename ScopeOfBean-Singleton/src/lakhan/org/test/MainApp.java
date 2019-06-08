package lakhan.org.test;

import lakhan.org.hello.Helloword;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
	public static void main(String[] arg){
		ApplicationContext co=new ClassPathXmlApplicationContext("Spring.xml");
		Helloword helloword=(Helloword)co.getBean("hell");
		helloword.setMessage("my name is lakhan singh");
		System.out.println(helloword);
		
		
		//new instance is created
		Helloword helloword1=(Helloword)co.getBean("hell");
		System.out.println(helloword1);
		
	}

}
