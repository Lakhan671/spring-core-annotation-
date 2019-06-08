import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextStartedEvent;



public class CstartEventHandler implements ApplicationListener<ContextStartedEvent> {

	
	@Override
	public void onApplicationEvent(ContextStartedEvent event) {
		System.out.println("....Start event as...");
	
		
	}

}
