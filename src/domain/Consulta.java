package domain;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Consulta {
    private int cod_consulta;
    private Date data;
    private String resumo;
    private List<Tratamento> tratamentos = new ArrayList<>();
    private List<Veterinario> veterinarios = new ArrayList<>();

    public Consulta(int cod_consulta, Date data, String resumo) {
        this.cod_consulta = cod_consulta;
        this.data = data;
        this.resumo = resumo;
    }

    public int getCod_consulta() {
        return cod_consulta;
    }

    public void setCod_consulta(int cod_consulta) {
        this.cod_consulta = cod_consulta;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public String getResumo() {
        return resumo;
    }

    public void setResumo(String resumo) {
        this.resumo = resumo;
    }

    public List<Tratamento> getTratamentos() {
        return tratamentos;
    }

    public void setTratamentos(List<Tratamento> tratamentos) {
        this.tratamentos = tratamentos;
    }

    public List<Veterinario> getVeterinarios() {
        return veterinarios;
    }

    public void setVeterinarios(List<Veterinario> veterinarios) {
        this.veterinarios = veterinarios;
    }

    @Override
    public String toString() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        String dataFormatada = dateFormat.format(data);
        return "Consulta [cod_consulta=" + cod_consulta + ", data=" + dataFormatada + ", resumo=" + resumo + "]";
    }
}
