package com.coherentsolutions.spring.school.section22;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class GreetingController {

    @Autowired
    private GreetingService greetingService;

    @GetMapping("/greet")
    public String greet(Model model) {
        String greetingMessage = greetingService.getGreeting();
        model.addAttribute("message", greetingMessage);
        return "greet"; // This view name will be resolved by the view resolver
    }
}
