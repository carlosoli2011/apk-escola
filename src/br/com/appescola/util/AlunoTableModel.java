package br.com.appescola.util;

import br.com.appescola.entidade.Aluno;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

public class AlunoTableModel extends AbstractTableModel {

    private final List<Aluno> dados = new ArrayList<>();
    private final String[] colunas = {"Código", "Matricula", "Nome", "Rg", "CPF"};

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
                return dados.get(linha).getMatricula();
            case 2:
                return dados.get(linha).getNome();
            case 3:
                return dados.get(linha).getRg();
            case 4:
                return dados.get(linha).getCpf();
        }
        return null;
    }

    public void addRow(Aluno aluno) {
        this.dados.add(aluno);
        this.fireTableDataChanged();
    }
    
    

}
