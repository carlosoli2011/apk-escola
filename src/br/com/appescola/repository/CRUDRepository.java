package br.com.appescola.repository;

import java.util.List;

public interface CRUDRepository<T> {

    void Salvar(T t);

    List<T> findAll();

    boolean excluirPorId(long id);

}
