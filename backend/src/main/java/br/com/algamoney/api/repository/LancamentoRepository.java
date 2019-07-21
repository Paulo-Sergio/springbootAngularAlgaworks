package br.com.algamoney.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.algamoney.api.model.Lancamento;
import br.com.algamoney.api.repository.lancamento.LancamentoRepositoryQuery;

public interface LancamentoRepository extends JpaRepository<Lancamento, Long>, LancamentoRepositoryQuery {

}
