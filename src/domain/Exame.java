package domain;

import java.util.ArrayList;
import java.util.List;

public class Exame {
    private int codigo;
    private String tipo;
    private String resultado;
    private List<Consulta> consultas = new ArrayList<>();

    public Exame(int codigo, String tipo, String resultado) {
        this.codigo = codigo;
        this.tipo = tipo;
        this.resultado = resultado;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getResultado() {
        return resultado;
    }

    public void setResultado(String resultado) {
        this.resultado = resultado;
    }

    public List<Consulta> getConsultas() {
        return consultas;
    }

    public void setConsultas(List<Consulta> consultas) {
        this.consultas = consultas;
    }

    @Override
    public String toString() {
        return "Exame [codigo=" + codigo + ", tipo=" + tipo + ", resultado=" + resultado + "]";
    }
}
