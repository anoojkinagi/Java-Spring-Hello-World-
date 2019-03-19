package anoojkinagispringexample;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
   public static void main(String[] args) {
      @SuppressWarnings("resource")
	ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
      HelloWorld obj = (HelloWorld) context.getBean("helloWorld");
      
      obj.getMessage();
      NameClass obj1 = (NameClass) context.getBean("nameClass"); 
      obj1.setName("Name Class message set!");
      obj1.getName();
   }
}