package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DemoApplication {

public static void main(String[] args) {
SpringApplication.run(DemoApplication.class, args);
}

@GetMapping("/hello")
public String calc(@RequestParam(value="nr1") int nr1, @RequestParam(value="nr2") int nr2,@RequestParam(value="op") String op) {

	int ans = 0;

	switch (op){
		case "ADD":
			ans = nr1+nr2;
			break;
		case "SUBTRACT":
			ans = nr1-nr2;
			break;
		case "MULTIPLY":
			ans = nr1*nr2;
			break;
		case "DIVIDE":
			ans = nr1/nr2;
			break;
	}
	System.out.println(op);
	System.out.println(ans);

	return Integer.toString(ans);
}

}

