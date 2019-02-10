package br.com.appescola.repository;

import br.com.appescola.entidade.Professor;
import java.util.ArrayList;
import java.util.List;

public class ProfessorRepository implements CRUDRepository<Professor>{

    @Override
    public void Salvar(Professor curso) {
        //envia o json para salvar
    }

    @Override
    public List<Professor> findAll() {
        List<Professor> listAll = new ArrayList<>();
        return listAll;//busca todos os jsons da api
    }

    @Override
    public boolean excluirPorId(long id) {
        boolean retorno = true;
        return retorno;
    }
    
}
