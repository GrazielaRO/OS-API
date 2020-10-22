package br.com.osdemo.domain.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.osdemo.domain.model.Cliente;

@Repository
public interface ClienteRepository extends JpaRepository <Cliente, Long>{
	
	List<Cliente> findByNomeContaining (String nome);

}
