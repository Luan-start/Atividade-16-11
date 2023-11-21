package com.example.demo.repository;


import java.util.List;
import java.util.Optional;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entities.Compromisso;

@Repository
public interface CompromissoRepository extends JpaRepository<Compromisso, Long>{
	    Optional<Compromisso> findById(Long id);
	    List<Compromisso> findByLocal(String local);
	    List<Compromisso> findByData(String data);
	    List<Compromisso> findByContato(String contato);
	}
