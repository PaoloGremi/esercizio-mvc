package it.thinkopen.eserciziomvc.controller;

import it.thinkopen.eserciziomvc.dto.SommaDto;
import it.thinkopen.eserciziomvc.service.OperazioneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Collection;


@RestController
@RequestMapping("/test")
public class TestRestController {

    @Autowired
    OperazioneService operazioneService;

    @RequestMapping("prova")
    public Collection<SommaDto> prova() {
        Collection<SommaDto> strings = new ArrayList<>();
        strings.add(new SommaDto(1, 2));
        strings.add(new SommaDto(2, 3));
        strings.add(new SommaDto(4, 6));
        return strings;
    }

    @RequestMapping(value = "somma", method = RequestMethod.POST)
    public SommaDto sommav4(@RequestBody SommaDto sommaDto) {
        return operazioneService.somma(sommaDto);
    }

}
