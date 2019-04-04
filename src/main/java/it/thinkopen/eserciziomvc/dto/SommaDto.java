package it.thinkopen.eserciziomvc.dto;

public class SommaDto {

    private Integer addendo1;
    private Integer addendo2;
    private Integer risultato;

    public SommaDto() {

    }

    public SommaDto(Integer addendo1, Integer addendo2) {
        this.addendo1 = addendo1;
        this.addendo2 = addendo2;
    }

    public SommaDto(Integer addendo1, Integer addendo2, Integer risultato) {
        this.addendo1 = addendo1;
        this.addendo2 = addendo2;
        this.risultato = risultato;
    }

    public Integer getAddendo1() {
        return addendo1;
    }

    public void setAddendo1(Integer addendo1) {
        this.addendo1 = addendo1;
    }

    public Integer getAddendo2() {
        return addendo2;
    }

    public void setAddendo2(Integer addendo2) {
        this.addendo2 = addendo2;
    }

    public Integer getRisultato() {
        return risultato;
    }

    public void setRisultato(Integer risultato) {
        this.risultato = risultato;
    }
}
