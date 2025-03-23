package lk.ac.vau.fas.ict;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping

public class AppController {
	@GetMapping("/msg")
	public String myMessage()
	{
		return "Hello SpringBoot";
	}
}
	