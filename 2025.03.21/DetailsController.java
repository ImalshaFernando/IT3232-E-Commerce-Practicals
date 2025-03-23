package lk.ac.vau.fas.ict;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/app")
public class DetailsController {
	@GetMapping("/details")
	public String DetailsController() {
		String name = "Name: Imalsha";
		String age = "Age: 23";
		String regNo = "Reg.No : 2020ICT106";
		String course = "COurse:ICT";
		
		return name+"<br>" + age + "<br>" + regNo+ "<br>" + course;	
		}

}
