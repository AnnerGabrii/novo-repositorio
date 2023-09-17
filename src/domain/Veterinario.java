package domain;

public class Veterinario {
    private int codigo;
    private String nome;
    private String CMRV;

    public Veterinario(int codigo, String nome, String CMRV) {
        this.codigo = codigo;
        this.nome = nome;
        this.CMRV = CMRV;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCMRV() {
        return CMRV;
    }

    public void setCMRV(String CMRV) {
        this.CMRV = CMRV;
    }

    @Override
    public String toString() {
        return "Veterinario [codigo=" + codigo + ", nome=" + nome + ", CMRV=" + CMRV + "]";
    }
}
