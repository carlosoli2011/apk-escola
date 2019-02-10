package br.com.appescola.repository;

import br.com.appescola.entidade.Aluno;
import java.util.ArrayList;
import java.util.List;

public class AlunoRepository implements CRUDRepository<Aluno>{

    @Override
    public void Salvar(Aluno aluno) {
        //envia o json para salvar
    }

    @Override
    public List<Aluno> findAll() {
        List<Aluno> listAll = new ArrayList<>();
        return listAll;//busca todos os jsons da api
    }

    @Override
    public boolean excluirPorId(long id) {
        boolean retorno = true;
        return retorno;
    }
    
}
