package no.kjetil.hellothere.domain;

import java.util.List;

public record Work(
    String company, Integer startYear, Integer endYear, 
    List<String> roles, List<String> technologie,
    List<Project> projects, List<String> workTasks
) {
    
}
