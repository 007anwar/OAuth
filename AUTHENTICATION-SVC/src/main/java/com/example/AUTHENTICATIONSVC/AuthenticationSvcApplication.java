package com.example.AUTHENTICATIONSVC;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableAuthorizationServer;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.security.Principal;
@SpringBootApplication
@EnableAuthorizationServer
@RestController
public class AuthenticationSvcApplication {

	public static void main(String[] args) {
		SpringApplication.run(AuthenticationSvcApplication.class, args);
	}
	@RequestMapping("/validateUser")
	public Principal user(Principal user) {
		return user;
	}
}
