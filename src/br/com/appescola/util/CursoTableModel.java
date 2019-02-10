package br.com.appescola.util;

import br.com.appescola.entidade.Curso;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

public class CursoTableModel extends AbstractTableModel {

    private List<Curso> dados = new ArrayList<>();
    private final String[] colunas = {"Código", "Descrição", "Duração", "Período", "Qtd. Alunos", "Carga Horária"};

    @Override
    public String getColumnName(int column) {
        return colunas[column];
    }
    
    @Override
    public int getRowCount() {
        return dados.size();
    }

    @Override
    public int getColumnCount() {
        return colunas.length;
    }

    @Override
    public Object getValueAt(int linha, int coluna) {
        switch (coluna) {
            case 0:
                return dados.get(linha).getId();
            case 1:
                return dados.get(linha).getDescricao();
            case 2:
                return dados.get(linha).getDescricao();
            case 3:
                return dados.get(linha).getPeriodo();
            case 4:
                return dados.get(linha).getQuantidadeAluno();
            case 5:
                return dados.get(linha).getCargaHoraria();
        }
        return null;
    }

    public void addRow(Curso curso) {
        this.dados.add(curso);
        this.fireTableDataChanged();
    }
    
    

}
