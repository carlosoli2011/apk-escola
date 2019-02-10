package br.com.appescola.repository;

import br.com.appescola.entidade.Disciplina;
import java.util.ArrayList;
import java.util.List;

public class DisciplinaRepository implements CRUDRepository<Disciplina>{

    @Override
    public void Salvar(Disciplina disciplina) {
        //envia o json para salvar
    }

    @Override
    public List<Disciplina> findAll() {
        List<Disciplina> listAll = new ArrayList<>();
        return listAll;//busca todos os jsons da api
    }

    @Override
    public boolean excluirPorId(long id) {
        boolean retorno = true;
        return retorno;
    }
    
}
