package it.sirfin.service.impl;

import it.sirfin.model.Docente;
import it.sirfin.repository.DocenteRepository;
import it.sirfin.service.ScuolaService;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;

public class ScuolaServiceImpl implements ScuolaService {

    @Autowired
    DocenteRepository docenteRepository;

    @Override
    public void inserisciDocente(Docente doc) {
        docenteRepository.save(doc);
    }

    @Override
    public void cancellaDocenti() {
        docenteRepository.deleteAllInBatch();

    }

    @Override
    public List<Docente> recuperaTuttiDocenti() {

        List<Docente> doc = docenteRepository.findAll();
        return doc;
    }

    @Override
    public void cancellaDocentiChiavePrimariaDispari(Docente d) {
        docenteRepository.delete(d);

    }

    @Override
    public void inizializzazione() {
        ArrayList<Docente> docenti = new ArrayList<>();
        docenti.add(new Docente("Aldo", "asda"));
        docenti.add(new Docente("Carlo", "Baglio"));
        docenti.add(new Docente("Marco", "Baglio"));
        docenti.add(new Docente("Poldo", "Baglio"));
        docenti.add(new Docente("Tizio", "Baglio"));
        cancellaDocenti();

        for (Docente doc : docenti) {

            inserisciDocente(doc);
        }
        List<Docente> listaAggiornata = recuperaTuttiDocenti();
        docenti.forEach(d -> System.out.println(d));

        listaAggiornata.stream()
                .filter(s -> s.getId() % 2 == 1)
                .forEach(s -> cancellaDocentiChiavePrimariaDispari(s));

        List<Docente> listaAggiornata2 = recuperaTuttiDocenti();
        docenti.forEach(d -> System.out.println(d));
    }
}
