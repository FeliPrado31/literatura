package com.alura.LiterAlura.service;

import com.alura.LiterAlura.model.DadosLivro;
import com.alura.LiterAlura.model.Livro;
import com.alura.LiterAlura.repository.LivroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Scanner;

@Service
public class LivroService {

    private final LivroRepository livroRepository;
    private final ConsumoApi consumoApi;
    private final ConverteDados converteDados;

    @Autowired
    public LivroService(LivroRepository livroRepository, ConsumoApi consumoApi, ConverteDados converteDados) {
        this.livroRepository = livroRepository;
        this.consumoApi = consumoApi;
        this.converteDados = converteDados;
    }

    public void buscarLivro() {
        System.out.print("Digite o nome do livro: ");
        String titulo = new Scanner(System.in).nextLine();
        String json = consumoApi.obterDados("https://gutendex.com/books?search=" + titulo);
        DadosLivro dadosLivro = converteDados.obterDados(json, DadosLivro.class);

        if (dadosLivro == null || dadosLivro.titulo() == null) {
            System.out.println("Livro não encontrado.");
            return;
        }

        System.out.println(dadosLivro);

        if (!livroRepository.existsByTitulo(dadosLivro.titulo())) { // Usamos existsByTitulo aquí
            Livro livro = new Livro(dadosLivro);
            livroRepository.save(livro);
            System.out.println("Livro salvo: " + livro.getTitulo());
        } else {
            System.out.println("Livro já existe no banco de dados.");
        }
    }

    public void listaLivros() {
        List<Livro> livros = livroRepository.findAll();
        if (livros.isEmpty()) {
            System.out.println("Nenhum livro registrado.");
        } else {
            livros.forEach(System.out::println);
        }
    }

    public void listarLivrosPorIdioma() {
        System.out.print("Digite o idioma: ");
        String idioma = new Scanner(System.in).nextLine();
        List<Livro> livros = livroRepository.findByIdiomasContaining(idioma);
        if (livros.isEmpty()) {
            System.out.println("Nenhum livro encontrado.");
        } else {
            livros.forEach(System.out::println);
        }
    }
}