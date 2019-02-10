package br.com.appescola.entidade;

import br.com.appescola.util.TipoPeriodo;

public class Curso {

    private Long id;
    private String descricao;
    private int duracao;
    private TipoPeriodo periodo;
    private int quantidadeAluno;
    private int cargaHoraria;

    public Long getId() {
        return id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    public TipoPeriodo getPeriodo() {
        return periodo;
    }

    public void setPeriodo(TipoPeriodo periodo) {
        this.periodo = periodo;
    }

    public int getQuantidadeAluno() {
        return quantidadeAluno;
    }

    public void setQuantidadeAluno(int quantidadeAluno) {
        this.quantidadeAluno = quantidadeAluno;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }
}
