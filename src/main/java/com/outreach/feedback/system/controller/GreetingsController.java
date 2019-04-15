package com.outreach.feedback.system.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class GreetingsController {

	@GetMapping("/greetings")
    @ResponseBody
    public String welcomeUser() {
        return "Hi!! Welcome to feedback system";
    }
	
}
