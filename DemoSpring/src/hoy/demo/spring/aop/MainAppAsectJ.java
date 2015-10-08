package hoy.demo.spring.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainAppAsectJ {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 ApplicationContext context = 
             new ClassPathXmlApplicationContext("/hoy/demo/spring/aop/bean.xml");

      Student student = (Student) context.getBean("student");

      student.getName();
      student.getAge();
      
     // student.printThrowException();
	}

}
