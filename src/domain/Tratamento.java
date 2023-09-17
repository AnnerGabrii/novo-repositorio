package domain;

import java.util.ArrayList;
import java.util.List;

public class Tratamento {
    private int cod_trat;
    private Animal animal;
    private String descricao;
    private List<Consulta> consultas = new ArrayList<>();

    public Tratamento(int cod_trat, Animal animal, String descricao) {
        this.cod_trat = cod_trat;
        this.animal = animal;
        this.descricao = descricao;
    }

    public int getCod_trat() {
        return cod_trat;
    }

    public void setCod_trat(int cod_trat) {
        this.cod_trat = cod_trat;
    }

    public Animal getAnimal() {
        return animal;
    }

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public List<Consulta> getConsultas() {
        return consultas;
    }

    public void setConsultas(List<Consulta> consultas) {
        this.consultas = consultas;
    }

    @Override
    public String toString() {
        return "Tratamento [cod_trat=" + cod_trat + ", animal=" + animal + ", descricao=" + descricao + "]";
    }
}
