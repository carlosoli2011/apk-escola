package be.com.appescola.controller;

import br.com.appescola.entidade.Curso;
import br.com.appescola.repository.CRUDRepository;
import br.com.appescola.repository.CursoRepository;


public class CursoController {
    
    private CRUDRepository<Curso> repository;
    
    public void salvar(Curso curso) {
        new CursoRepository().Salvar(curso);
    }
   
    public Iterable<Curso> listaCursos() {
        Iterable<Curso> listaCursos = new CursoRepository().findAll();
        return listaCursos;
    }

    public boolean excluiPorId(Curso curso) {
        return new CursoRepository().excluirPorId(curso.getId());
    }
    
}
