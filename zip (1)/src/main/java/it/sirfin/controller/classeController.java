package it.sirfin.controller;

import it.sirfin.model.Docente;
import it.sirfin.service.ScuolaService;
import java.util.ArrayList;
import static java.util.Collections.list;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin("*")
@RestController

public class classeController {

    @Autowired
    ScuolaService scuolaService;

    @RequestMapping("/inizializzazione")
    public void ini() {

        ArrayList<Docente> docenti = new ArrayList<>();
        docenti.add(new Docente("Aldo", "asda"));
        docenti.add(new Docente("Carlo", "Baglio"));
        docenti.add(new Docente("Marco", "Baglio"));
        docenti.add(new Docente("Poldo", "Baglio"));
        docenti.add(new Docente("Tizio", "Baglio"));

        scuolaService.cancellaDocenti();

        for (Docente doc : docenti) {
            scuolaService.inserisciDocente(doc);
        }
        List<Docente> listaAggiornata = scuolaService.recuperaTuttiDocenti();
        docenti.forEach(d -> System.out.println(d));

        listaAggiornata.stream()
                .filter(s -> s.getId() % 2 == 1)
                .forEach(s -> scuolaService.cancellaDocentiChiavePrimariaDispari(s));
    
        List<Docente> listaAggiornata2 = scuolaService.recuperaTuttiDocenti();
        docenti.forEach(d -> System.out.println(d));
    }
}
