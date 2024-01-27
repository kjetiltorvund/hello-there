package no.kjetil.hellothere.controllers;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import no.kjetil.hellothere.domain.Greetings;
import no.kjetil.hellothere.domain.Person;
import no.kjetil.hellothere.service.GreetingsService;

@RestController
public class GreetingsController {
    
    private static String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    private final GreetingsService greetingsService;

    @Autowired
    public GreetingsController(GreetingsService greetingsService) {
        this.greetingsService = greetingsService;
    }

    @GetMapping("/greetings")
    public Greetings greetings(@RequestParam(value = "name", defaultValue = "Wordl") String name) {
        return new Greetings(counter.incrementAndGet(), String.format(template, name));
    }

    @GetMapping("/about-me")
    public ResponseEntity<Person> aboutMe(@RequestParam(value = "name") String name) {
        Person person = greetingsService.getPersonByName(name);
        return new ResponseEntity<>(
            person, 
        HttpStatus.OK);
    }
}
