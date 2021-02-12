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
    public void inizializzazione() {
        scuolaService.inizializzazione();
    }
}
