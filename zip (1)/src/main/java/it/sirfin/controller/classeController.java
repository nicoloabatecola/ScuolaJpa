package it.sirfin.controller;

import it.sirfin.model.Docente;
import it.sirfin.service.ScuolaService;
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
    public void inizializza() {

        Docente a = new Docente("Mario", "Rossi");
        scuolaService.inserisciDocente(a);
    }
}
