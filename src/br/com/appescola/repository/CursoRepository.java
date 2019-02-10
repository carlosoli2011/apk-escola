package br.com.appescola.repository;

import br.com.appescola.entidade.Curso;
import java.util.ArrayList;
import java.util.List;

public class CursoRepository implements CRUDRepository<Curso>{

    @Override
    public void Salvar(Curso curso) {
        //envia o json para salvar
    }

    @Override
    public List<Curso> findAll() {
        List<Curso> listAll = new ArrayList<>();
        return listAll;//busca todos os jsons da api
    }

    @Override
    public boolean excluirPorId(long id) {
        boolean retorno = true;
        return retorno;
    }
    
}
