package hoy.demo.spring.base.javaan;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;



public class MainAppJavaAn {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		AbstractApplicationContext ctx = new AnnotationConfigApplicationContext(BeanConfig.class);
		
	      TextEditor textEditor = (TextEditor) ctx.getBean(TextEditor.class);
	      textEditor.spellCheck();
	}

}
