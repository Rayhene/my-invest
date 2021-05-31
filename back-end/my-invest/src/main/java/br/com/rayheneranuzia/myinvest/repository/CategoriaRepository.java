package br.com.rayheneranuzia.myinvest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.rayheneranuzia.myinvest.domain.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, Long> {

}
