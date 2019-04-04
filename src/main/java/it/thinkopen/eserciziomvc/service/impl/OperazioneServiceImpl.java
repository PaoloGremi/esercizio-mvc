package it.thinkopen.eserciziomvc.service.impl;

import it.thinkopen.eserciziomvc.dto.SommaDto;
import it.thinkopen.eserciziomvc.service.OperazioneService;
import org.springframework.stereotype.Service;

@Service
public class OperazioneServiceImpl implements OperazioneService {

    @Override
    public Integer somma(Integer addendo1, Integer addendo2) {
        return addendo1 + addendo2;
    }

    @Override
    public SommaDto somma(SommaDto sommaDto) {
        sommaDto.setRisultato(sommaDto.getAddendo1() + sommaDto.getAddendo2());
        return sommaDto;
    }

    @Override
    public Integer somma(Integer... addendo) {
        Integer res = 0;
        for(Integer a : addendo) {
            res += a;
        }
        return res;
    }


}
