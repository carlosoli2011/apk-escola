package br.com.appescola.util;

import br.com.appescola.entidade.Disciplina;
import br.com.appescola.entidade.Professor;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

public class DisciplinaTableModel extends AbstractTableModel {

    private final List<Disciplina> dados = new ArrayList<>();
    private final String[] colunas = {"Código", "Descrição", "Ementa", "Limite de Vagas", "Código Professor", "Dia da Semana", "Carga Horária"};

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
                return dados.get(linha).getEmenta();
            case 3:
                return dados.get(linha).getLimiteDeVagas();
            case 4:
                return dados.get(linha).getIdProfessor();
            case 5:
                return dados.get(linha).getDiaDaSemana();
            case 6:
                return dados.get(linha).getCargaHoraria();
        }
        return null;
    }

    public void addRow(Disciplina disciplina) {
        this.dados.add(disciplina);
        this.fireTableDataChanged();
    }
    
    

}
