package no.kjetil.hellothere.domain;

import java.util.List;

public record Person(String name, String sureName, int age, List<String> placeOfUpbringings, 
String recidence, List<Person> children, Person spouse, List<Education> educations, 
List<Work> workHistory) {
    public Person(String name, String sureName, int age) {
        this(name, sureName, age, null, null, null, null, null, null);
    }
    public String fullName() {
        return String.format("%s %s", name, sureName);
    }
}
