import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class A {
	@Bean
	public A a(){
		return new A();
	}
	public void ainformation(){
		System.out.println(" i am inside in A");
	}
	

}
