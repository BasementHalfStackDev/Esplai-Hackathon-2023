/**
 * @author BasementHalfStackDev/Josep Maria Pallas Batalla
 */
package UserLogin.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // Rest controller
@RequestMapping("/api")
public class WelcomeController {


	@PreAuthorize("hasRole('USER')")
	@GetMapping("/welcome")
	public List<String> welcomeUser() {
		List<String> welcome = new ArrayList<>();
		welcome.add("Welcome to my API!");
		welcome.add("Created by BasementHalfStackDev / Josep Maria Pallàs Batalla");
		welcome.add("If you can read this, it means you're authenticated through JWT!");
		welcome.add("Done with Spring Framework for the 2023 Hackathon organised by: ");
		welcome.add("Fundació Esplai");
		welcome.add("T-Systems");
		welcome.add("Microsoft");
		welcome.add("All rights reserved.");
		
		return welcome;
	}

	
}
