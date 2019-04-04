package it.thinkopen.eserciziomvc.controller;

import it.thinkopen.eserciziomvc.dto.SommaDto;
import it.thinkopen.eserciziomvc.service.OperazioneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class TestController {

    @Autowired
    OperazioneService operazioneService;


    @RequestMapping(value = "/hello")
    @ResponseBody
    String sayHello() {
        return "CIAO!";
    }

    @RequestMapping("/ciao")
    public String hello(Model model,
                        @RequestParam(value = "name",
                                required = false,
                                defaultValue = "World")
                                String name) {
        model.addAttribute("name", name);
        return "ciao";
    }


    @RequestMapping(value = "/somma/{a1}/{a2}", method = RequestMethod.GET)
    @ResponseBody
    public Integer somma(@PathVariable("a1") Integer a1, @PathVariable("a2") Integer a2) {
        return operazioneService.somma(a1, a2);
    }

    @RequestMapping(value = "/v2/somma", method = RequestMethod.GET)
    @ResponseBody
    public Integer sommav2(@RequestParam("a1") Integer a1, @RequestParam("a2") Integer a2) {
        return operazioneService.somma(a1, a2);
    }


    @RequestMapping(value = "/v3/somma/{a1}/{a2}", method = RequestMethod.GET)
    @ResponseBody
    public SommaDto sommav3(@PathVariable("a1") Integer a1, @PathVariable("a2") Integer a2) {
        SommaDto sommaDto = new SommaDto();
        sommaDto.setAddendo1(a1);
        sommaDto.setAddendo2(a2);
        return operazioneService.somma(sommaDto);
    }


}
