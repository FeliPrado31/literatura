package com.alura.LiterAlura.repository;

import com.alura.LiterAlura.model.Livro;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface LivroRepository extends JpaRepository<Livro, Long> {
    Optional<Livro> findByTituloContainingIgnoreCase(String titulo); // Busca un libro por título (ignorando mayúsculas/minúsculas)
    boolean existsByTitulo(String titulo); // Verifica si un libro existe por su título
    List<Livro> findByIdiomasContaining(String idioma); // Busca libros por idioma
}