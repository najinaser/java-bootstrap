package com.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "--------Begin------");
        // Create the Spring ApplicationContext
//        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        String xmlFilePath = "../../../../applicationContext.xml";
        String path = "file:/Users/naji/github/java-bootstrap/applicationContext.xml";
//        ApplicationContext context = new AnnotationConfigApplicationContext(path);
        ApplicationContext context = new AnnotationConfigApplicationContext("applicationContext.xml");

        // Get the beans from the context
        Domain domain = context.getBean(Domain.class);
        Application application = context.getBean(Application.class);

        // Use the beans
        application.doSomething();
        System.out.println( "--------End--------");
    }
}
