package dev.rui.fullstack_demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
// import org.springframework.web.bind.annotation.GetMapping;
// import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
// @RestController
public class FullstackDemoApplication {

	public static void main(String[] args) {
	SpringApplication.run(FullstackDemoApplication.class, args);
	}

	// @GetMapping("/")
	// public String apiRoot(){
	// 	return "Hello world!";
	// }

}
