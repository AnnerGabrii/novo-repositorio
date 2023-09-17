package domain;

import java.util.ArrayList;
import java.util.List;

public class Animal {
    private int cod_animal;
    private String nome;
    private String sexo;
    private int idade;
    private Especie especie; // Referência à instância de Especie

    private List<Tratamento> tratamentos = new ArrayList<>();

    public Animal(int cod_animal, String nome, String sexo, int idade, String string) {
        this.cod_animal = cod_animal;
        this.nome = nome;
        this.sexo = sexo;
        this.idade = idade;
        this.especie = new Especie(1, string); // Substitua 1 pelo código da espécie desejada
    }

    public int getCod_animal() {
        return cod_animal;
    }

    public void setCod_animal(int cod_animal) {
        this.cod_animal = cod_animal;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public Especie getEspecie() {
        return especie;
    }

    public void setEspecie(Especie especie) {
        this.especie = especie;
    }

    public List<Tratamento> getTratamentos() {
        return tratamentos;
    }

    public void setTratamentos(List<Tratamento> tratamentos) {
        this.tratamentos = tratamentos;
    }

    @Override
    public String toString() {
        return "Animal [cod_animal=" + cod_animal + ", nome=" + nome + ", sexo=" + sexo + ", idade=" + idade + ", especie=" + especie.getNome() + "]";
    }
}
