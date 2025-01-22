package com.alura.LiterAlura.principal;

import com.alura.LiterAlura.service.AutorService;
import com.alura.LiterAlura.service.LivroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Scanner;

@Component
public class Principal {

    private final Scanner scanner;
    private final LivroService livroService;
    private final AutorService autorService;

    @Autowired
    public Principal(LivroService livroService, AutorService autorService) {
        this.scanner = new Scanner(System.in);
        this.livroService = livroService;
        this.autorService = autorService;
    }

    public void exibirMenu() {
        try {
            while (true) {
                System.out.println("Escolha uma opção: \n");
                System.out.println("1 - Buscar livro pelo título");
                System.out.println("2 - Listar livros registrados");
                System.out.println("3 - Buscar autores registrados");
                System.out.println("4 - Listar autores vivos em determinado ano");
                System.out.println("5 - Listar livros em determinado idioma");
                System.out.println("0 - Sair");
                System.out.print("Escolha uma opção: ");
                int escolha = Integer.parseInt(scanner.nextLine());

                switch (escolha) {
                    case 1:
                        livroService.buscarLivro();
                        break;
                    case 2:
                        livroService.listaLivros();
                        break;
                    case 3:
                        autorService.listarAutores();
                        break;
                    case 4:
                        autorService.buscarAutoresVivosPorAno();
                        break;
                    case 5:
                        livroService.listarLivrosPorIdioma();
                        break;
                    case 0:
                        System.out.println("Saindo...");
                        return;
                    default:
                        System.out.println("Opção inválida. Tente novamente.");
                        break;
                }
            }
        } catch (NumberFormatException e) {
            System.out.println("Entrada inválida. Por favor, insira um número.");
        } finally {
            scanner.close();
        }
    }
}