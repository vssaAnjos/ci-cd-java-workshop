package com.testService;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController /** This is the javadoc example. */
@CrossOrigin /** This is the javadoc example. */
public class TestController {

@GetMapping("/home")
/** {@inheritDoc} */
	public String homeRequest() {
		return "Hello World!";
	}
}
