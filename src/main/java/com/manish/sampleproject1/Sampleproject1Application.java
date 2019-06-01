package com.manish.sampleproject1;

import java.net.InetAddress;
import java.net.UnknownHostException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.env.Environment;

@SpringBootApplication
public class Sampleproject1Application {

	private static final Logger log = LoggerFactory.getLogger(Sampleproject1Application.class);
	public static void main(String[] args) throws UnknownHostException {
		SpringApplication app = new SpringApplication(Sampleproject1Application.class);
		
		Environment env = app.run(args).getEnvironment();
		String protocol = "http";
		
		if(env.getProperty("server.ssl.key-store")!=null) {
			protocol="https";
		}
		log.info("\n----------------------------\n"
				+ "Application {} is running! Access urls:\n\t "
				+ "Local: \t\t{}://localhost:{}\n\t"
				+ "Local Swagger link : \t\t{}://localhost:{}/swagger-ui.html\n\t",
		env.getProperty("spring.application.name"), 
		protocol, env.getProperty("server.port"),
		 protocol, env.getProperty("server.port"),
		InetAddress.getLocalHost().getHostAddress(), env.getActiveProfiles());
		
	}

}
