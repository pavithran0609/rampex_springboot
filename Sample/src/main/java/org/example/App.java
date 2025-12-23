package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context=new ClassPathXmlApplicationContext("javaconfig.xml");
       // System.out.println( "Hello World!" );
       // Engine en=(Engine) context.getBean("st1");
       // en.startEngine();
        // Bike b=context.getBean(Bike.class);
        Bike b=(Bike)context.getBean("b1");
       // b.setAge(29);
       // System.out.println(b.getAge()+" "+ b.getRoll());
        // b.ride();
        b.work();
    }
}
