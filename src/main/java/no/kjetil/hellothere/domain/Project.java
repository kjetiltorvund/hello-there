package no.kjetil.hellothere.domain;

import java.util.List;

public record Project(String name, String description, List<String> technologies) {
}
