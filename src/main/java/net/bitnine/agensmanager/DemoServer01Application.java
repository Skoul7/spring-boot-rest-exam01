package net.bitnine.agensmanager;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


/*
 * This is the main Spring Boot application class. It configures Spring Boot, JPA, Swagger
 */

@EnableAutoConfiguration  // Sprint Boot Auto Configuration
@ComponentScan(basePackages = "net.bitnine.agensmanager")
@EnableJpaRepositories("net.bitnine.agensmanager.dao.jpa") // To segregate MongoDB and JPA repositories. Otherwise not needed.
//@SpringBootApplication
public class DemoServer01Application extends SpringBootServletInitializer {

    private static final Class<DemoServer01Application> applicationClass = DemoServer01Application.class;
    private static final Logger log = LoggerFactory.getLogger(applicationClass);
    
	public static void main(String[] args) {
		SpringApplication.run(DemoServer01Application.class, args);
	}
	
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(applicationClass);
    }	
}
