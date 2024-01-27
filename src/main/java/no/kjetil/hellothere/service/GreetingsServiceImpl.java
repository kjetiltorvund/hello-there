package no.kjetil.hellothere.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import no.kjetil.hellothere.domain.Education;
import no.kjetil.hellothere.domain.Person;
import no.kjetil.hellothere.domain.Project;
import no.kjetil.hellothere.domain.Work;

@Service
public class GreetingsServiceImpl implements GreetingsService {
    
    @Override
    public Person getPersonByName(String name) {
        List<String> placesOfUpbringing = Arrays.asList("Bærum", "Stathelle");
        List<Person> children = Arrays.asList(
        new Person("Alva", "Torvund Minde", 10),
        new Person("Liam", "Torvund Minde", 7),
        new Person("Elliot", "Torvund Minde", 4)
        );
        
        List<Education> educations = Arrays.asList(
        new Education("Bamble videregående skole", "Allmenne, Administrative fag", null),
        new Education("Universitetet i Oslo", "Informatikk", "Bachelor")
        );
        
        List<String> technologies = List.of("Java", "Spring", "JBoss app-server", "Oracle DB");
        Work visma = new Work("Visma Consulting AS", 2011, 2015, 
        List.of("Systemutvikler", "Tester"), List.of("Java", "Maven", "OracleDB", "Spring"), 
        List.of(
        new Project("NAV Brev og Arkiv", "Digitaliseringavdokumentbehandling.", technologies), 
        new Project("NAV EDAG", "Utvikleenmottaksløsningforinnrapporteringavarbeidsgiverogarbeidstakersineforhold.", technologies), 
        new Project("NAV Pensjonsreformen Uføre", "Utvikle enny løsning foruførepensjonsombyggerviderepådagens løsning, Pesys.", technologies), 
        new Project("NAV Felles registeret - Digital kontaktinformasjon", "UtvikleenintegrasjonskomponentmellomNAVogDIFI.Komponentenskal sørgeforatNAVsine tjenesteralltidskal kunnehenteutpersonerskontaktinformasjon.", technologies)
        ),
        List.of("Utvikle nye løsninger.", "Teste kode", "Kvalitetsjekke kode", "Planlegge nye oppgaver", "Estimere oppgaver.", "Dokumentere løsninger.")
        );
        
        Work spinnerLabs = new Work("Spinnerlabs AS", 2015, 2016, 
        List.of("Systemutvikler", "Tester"), 
        List.of("PHP", "MySQL", "Laravel", "Puphpet", "Composer", "Vue.js"), List.of(), 
        List.of("Utvikle nye løsninger.", "Teste kode", "Kvalitetsjekke kode", "Planlegge nye oppgaver", "Estimere oppgaver.", "Dokumentere løsninger."));

        Work gurusoft = new Work("Gurusoft AS", 2016, 2022, 
        List.of("Systemutvikler", "Tester"), 
        List.of("Java", "Maven", "MariaDB", "Spring", "JavaScript", "AngularJS", "Vue.js"), List.of(), 
        List.of("Utvikle nye løsninger.", "Teste kode", "Kvalitetsjekke kode", "Planlegge nye oppgaver", "Estimere oppgaver.", "Dokumentere løsninger."));

        Work ngn = new Work("Norsk Gjenvinning AS", 2016, null, 
        List.of("Full-stack", "Tester", "DevOps"), 
        List.of("Java", "Maven", "MariaDB", "PostgreSQL", "Spring", "JavaScript", "Angular", "React", "Typescript", "Azure", "Kubernetes"), List.of(), 
        List.of("Utvikle nye løsninger.", "DevOps", "Teste kode", "Kvalitetsjekke kode", "Planlegge nye oppgaver", "Estimere oppgaver.", "Dokumentere løsninger."));
        
        List<Work> workHistory = Arrays.asList(
        visma, spinnerLabs, gurusoft, ngn);
        
        return new Person("Kjetil", "Torvund Minde", 39, placesOfUpbringing, 
        "Porsgrunn", children, new Person("Hanne", "Torvund Minde", 38), 
        educations, workHistory);
    }
    
}
