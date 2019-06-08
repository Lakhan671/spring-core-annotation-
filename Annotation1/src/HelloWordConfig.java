import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class HelloWordConfig {
	@Bean
	public HelloWord helloWord()
	{
		return new HelloWord();
	}

}
