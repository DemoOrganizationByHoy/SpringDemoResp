package hoy.demo.spring.base.javaan;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfig {

	@Bean
	 public HelloWorld helloWorld(){
	      return new HelloWorld();
	   }
/*	
	@Bean
	 public InitHelloWorld InitHelloWorld(){
	      return new InitHelloWorld();
	   }
*/	
	@Bean
	 public SpellChecker spellChecker(){
	      return new SpellChecker();
	   }
	
	@Bean
	 public TextEditor textEditor(){
	      return new TextEditor();
	   }
	
}
