package br.com.appescola.entidade;

import br.com.appescola.util.TipoPeriodo;

public class Disciplina {

    private Long id;
    private String descricao;
    private String ementa;
    private int limiteDeVagas;
    private int idProfessor;
    private int diaDaSemana;
    private int cargaHoraria;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getEmenta() {
        return ementa;
    }

    public void setEmenta(String ementa) {
        this.ementa = ementa;
    }

    public int getLimiteDeVagas() {
        return limiteDeVagas;
    }

    public void setLimiteDeVagas(int limiteDeVagas) {
        this.limiteDeVagas = limiteDeVagas;
    }

    public int getIdProfessor() {
        return idProfessor;
    }

    public void setIdProfessor(int idProfessor) {
        this.idProfessor = idProfessor;
    }

    public int getDiaDaSemana() {
        return diaDaSemana;
    }

    public void setDiaDaSemana(int diaDaSemana) {
        this.diaDaSemana = diaDaSemana;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    
}
