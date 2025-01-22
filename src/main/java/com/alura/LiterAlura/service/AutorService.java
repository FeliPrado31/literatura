package com.alura.LiterAlura.service;

import com.alura.LiterAlura.model.Autor;
import com.alura.LiterAlura.repository.AutorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Scanner;

@Service
public class AutorService {

    private final AutorRepository autorRepository;

    @Autowired
    public AutorService(AutorRepository autorRepository) {
        this.autorRepository = autorRepository;
    }

    public void listarAutores() {
        List<Autor> autores = autorRepository.findAll();
        if (autores.isEmpty()) {
            System.out.println("Nenhum autor registrado.");
        } else {
            autores.forEach(System.out::println);
        }
    }

    public void buscarAutoresVivosPorAno() {
        System.out.print("Digite o ano: ");
        int ano = new Scanner(System.in).nextInt();
        List<Autor> autores = autorRepository.findByAnoNascimentoLessThanEqualAndAnoFalecimentoGreaterThanEqual(ano, ano);
        if (autores.isEmpty()) {
            System.out.println("Nenhum autor encontrado.");
        } else {
            autores.forEach(System.out::println);
        }
    }
}