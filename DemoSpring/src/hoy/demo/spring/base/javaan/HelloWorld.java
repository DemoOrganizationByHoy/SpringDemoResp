package hoy.demo.spring.base.javaan;

public class HelloWorld {
	  private String message;

	   public void setMessage(String message){
	      this.message  = message;
	   }
	   public void getMessage(){
	      System.out.println("Your Message : " + message);
	   }

	   /* Comment by Worakrit I. @ 2015
	   public void init(){
	      System.out.println("Bean is going through init.");
	   } */

	   public void destroy(){
	      System.out.println("Bean will destroy now.");
	   }
}
