package me.whiteship.demooauth2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableOAuth2Client;

@SpringBootApplication
public class DemoOauth2Application {

	public static void main(String[] args) {
		SpringApplication.run(DemoOauth2Application.class, args);
	}
}
