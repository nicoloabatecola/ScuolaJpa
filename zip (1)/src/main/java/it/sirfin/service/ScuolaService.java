package it.sirfin.service;

import it.sirfin.model.Docente;
import java.util.List;

public interface ScuolaService {

    void inserisciDocente(Docente doc);
    void cancellaDocenti();
    List<Docente> recuperaTuttiDocenti();
    void cancellaDocentiChiavePrimariaDispari(Docente d);
}
