package it.thinkopen.eserciziomvc.service;

import it.thinkopen.eserciziomvc.dto.SommaDto;

public interface OperazioneService {

    Integer somma(Integer addendo1, Integer addendo2);
    SommaDto somma(SommaDto sommaDto);
    Integer somma(Integer... addendo);
}
