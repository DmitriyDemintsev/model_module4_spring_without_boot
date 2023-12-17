package ru.practicum;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.apache.catalina.Context;
import org.apache.catalina.LifecycleException;
import org.apache.catalina.Wrapper;
import org.apache.catalina.startup.Tomcat;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

@SpringBootApplication
public class LaterApplication {
    public static void main(String[] args) {
        SpringApplication.run(LaterApplication.class, args);

//        Tomcat tomcat = new Tomcat();
//        tomcat.getConnector().setPort(8080);

        // то самое "приложение" или "контекст" с пустым путём
//        Context tomcatContext = tomcat.addContext("", null);

        // создаём контекст
//        AnnotationConfigWebApplicationContext applicationContext =
//                new AnnotationConfigWebApplicationContext();
//        applicationContext.setServletContext(tomcatContext.getServletContext());
//        applicationContext.scan("ru.practicum");
//        applicationContext.refresh();
//
//        // добавляем диспетчер запросов
//        DispatcherServlet dispatcherServlet = new DispatcherServlet(applicationContext);
//        Wrapper dispatcherWrapper =
//                Tomcat.addServlet(tomcatContext, "dispatcher", dispatcherServlet);
//        dispatcherWrapper.addMapping("/");
//        dispatcherWrapper.setLoadOnStartup(1);

//          tomcat.start();
    }
}
