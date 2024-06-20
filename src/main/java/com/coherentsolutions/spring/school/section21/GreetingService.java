package com.coherentsolutions.spring.school.section21;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Random;

@Service
public class GreetingService {

    @Autowired
    private GreetingRepository greetingRepository;

    public String getGreeting() {
        List<String> greetings = greetingRepository.findAllGreetings();
        return greetings.get(new Random().nextInt(greetings.size()));
    }
}
