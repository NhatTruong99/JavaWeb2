package truong.canhan.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CaNhanController {
	
	@GetMapping("/")
	public String HomePage() {
		return "homePage";
	}
	
	@GetMapping("/about")
	public String About() {
		return "about";
	}
	
	@GetMapping("/contact")
	public String Contact() {
		return "contact";
	}
}
