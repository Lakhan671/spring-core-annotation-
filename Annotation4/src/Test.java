import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class Test {

	public static void main(String[] args) {
		ApplicationContext co=new AnnotationConfigApplicationContext(Appli_con.class);
		Foo f=co.getBean(Foo.class);
		f.dd();
		System.out.println(f);
		
		Foo ff=co.getBean(Foo.class);
		System.out.println(ff);
	}

}
