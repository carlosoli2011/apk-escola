package be.com.appescola.controller;

import br.com.appescola.entidade.Professor;
import br.com.appescola.repository.CRUDRepository;
import br.com.appescola.repository.ProfessorRepository;


public class ProfessorController {
    
    private CRUDRepository<Professor> repository;
    
    public void salvar(Professor professor) {
        new ProfessorRepository().Salvar(professor);
    }
   
    public Iterable<Professor> listaProfessores() {
        Iterable<Professor> listaProfessores = new ProfessorRepository().findAll();
        return listaProfessores;
    }

    public boolean excluiPorId(Professor professor) {
        return new ProfessorRepository().excluirPorId(professor.getId());
    }
    
}
