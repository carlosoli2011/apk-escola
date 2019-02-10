package br.com.appescola.util;

public enum TipoPeriodo {
    MATUTINO("Matutino", 1),
    VESPERTINO("Vespertino", 2),
    NOTURNO("Noturno", 3),
    INTEGRAL("Integral", 4);

    private final int id;
    private final String descricao;

    private TipoPeriodo(String descricao, int id) {
        this.descricao = descricao;
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public int getId() {
        return id;
    }
}
