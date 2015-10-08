package hoy.demo.spring.base.xml;


import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		AbstractApplicationContext  context = new ClassPathXmlApplicationContext("/hoy/demo/spring/base/xml/Beans.xml");
	      TextEditor textEditor = (TextEditor) context.getBean("textEditor");
	      textEditor.spellCheck();
	}

}
