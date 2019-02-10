package br.com.appescola.util;

import br.com.appescola.entidade.Professor;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

public class ProfessorTableModel extends AbstractTableModel {

    private final List<Professor> dados = new ArrayList<>();
    private final String[] colunas = {"Código", "Nome", "Rg", "CPF", "Título"};

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
                return dados.get(linha).getNome();
            case 2:
                return dados.get(linha).getRg();
            case 3:
                return dados.get(linha).getCpf();
            case 4:
                return dados.get(linha).getTitulo();
        }
        return null;
    }

    public void addRow(Professor professor) {
        this.dados.add(professor);
        this.fireTableDataChanged();
    }
    
    

}
