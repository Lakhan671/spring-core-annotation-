import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import(A.class)
public class B {
	 @Bean
	public B b(){
		return new B();
	}
	
	public void display(){
		System.out.println("I am inside in B class ");
	}
  
}
