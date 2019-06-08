import org.apache.commons.httpclient.Cookie;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class Test {

	public static void main(String[] args) {
		ApplicationContext co=new AnnotationConfigApplicationContext(B.class);
		//A aa=co.getBean(A.class);
		//aa.ainformation();
		B bb=co.getBean(B.class);
	   bb.display();
	}

}
