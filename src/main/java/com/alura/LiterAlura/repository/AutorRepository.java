package com.alura.LiterAlura.repository;

import com.alura.LiterAlura.model.Autor;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AutorRepository extends JpaRepository<Autor, Long> {
    List<Autor> findByAnoNascimentoLessThanEqualAndAnoFalecimentoGreaterThanEqual(Integer anoNascimento, Integer anoFalecimento);
}