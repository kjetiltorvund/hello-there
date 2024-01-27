package no.kjetil.hellothere.service;

import no.kjetil.hellothere.domain.Person;

public interface GreetingsService {
    Person getPersonByName(String name);
}
