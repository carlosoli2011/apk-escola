package be.com.appescola.controller;

import br.com.appescola.entidade.Disciplina;
import br.com.appescola.repository.CRUDRepository;
import br.com.appescola.repository.DisciplinaRepository;


public class DisciplinaController {
    
    private CRUDRepository<Disciplina> repository;
    
    public void salvar(Disciplina disciplina) {
        new DisciplinaRepository().Salvar(disciplina);
    }
   
    public Iterable<Disciplina> listaDisciplinas() {
        Iterable<Disciplina> listaDisciplinas = new DisciplinaRepository().findAll();
        return listaDisciplinas;
    }

    public boolean excluiPorId(Disciplina disciplina) {
        return new DisciplinaRepository().excluirPorId(disciplina.getId());
    }
    
}
