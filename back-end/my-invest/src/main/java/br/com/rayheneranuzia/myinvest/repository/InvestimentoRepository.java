package br.com.rayheneranuzia.myinvest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.rayheneranuzia.myinvest.domain.Investimento;

public interface InvestimentoRepository extends JpaRepository<Investimento, Long>{

}
