package com.registro.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.registro.model.Plataforma;

@Repository
public interface PlataformaRepository extends JpaRepository<Plataforma, String>{

}
