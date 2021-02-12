package it.sirfin.service.impl;

import it.sirfin.model.Docente;
import it.sirfin.repository.DocenteRepository;
import it.sirfin.service.ScuolaService;
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
    
    

}
