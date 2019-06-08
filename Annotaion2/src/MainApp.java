import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class MainApp {
	public static void main(String[] args) {
		ApplicationContext co=new AnnotationConfigApplicationContext(TextEditorConfig.class);
		TextEditor text=co.getBean(TextEditor.class);
		//text.spellCheck();
	}

}
