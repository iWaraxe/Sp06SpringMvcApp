package com.coherentsolutions.spring.school.section21;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Repository
public class GreetingRepository {

    private List<String> greetings = new ArrayList<>(Arrays.asList("Hello", "Hi", "Greetings", "Welcome"));

    public List<String> findAllGreetings() {
        return greetings;
    }
}
