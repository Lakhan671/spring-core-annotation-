import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class Appli_con {
	@Bean(initMethod="init",destroyMethod="cleanup")
	@Scope("prototype")
 public Foo foo(){
	 return new Foo();
	 
 }
}
