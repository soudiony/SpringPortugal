package com.spring.aula.springaula.repository;

import com.spring.aula.springaula.modelo.Emprego;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmpregoRepository extends JpaRepository<Emprego, Long> {

}
