package domain;

public class Especie {
    private int cod_especie;
    private String nome;

    public Especie(int cod_especie, String nome) {
        this.cod_especie = cod_especie;
        this.nome = nome;
    }

    public int getCod_especie() {
        return cod_especie;
    }

    public void setCod_especie(int cod_especie) {
        this.cod_especie = cod_especie;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Especie [cod_especie=" + cod_especie + ", nome=" + nome + "]";
    }
}
