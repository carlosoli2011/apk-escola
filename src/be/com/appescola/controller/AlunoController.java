package be.com.appescola.controller;

import br.com.appescola.entidade.Aluno;
import br.com.appescola.repository.AlunoRepository;
import br.com.appescola.repository.CRUDRepository;


public class AlunoController {
    
    private CRUDRepository<Aluno> repository;
    
    public void salvar(Aluno aluno) {
        new AlunoRepository().Salvar(aluno);
    }
   
    public Iterable<Aluno> listaAlunos() {
        Iterable<Aluno> listaAlunos = new AlunoRepository().findAll();
        return listaAlunos;
    }

    public boolean excluiPorId(Aluno aluno) {
        return new AlunoRepository().excluirPorId(aluno.getId());
    }
    
}
