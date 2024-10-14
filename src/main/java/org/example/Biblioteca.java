package org.example;

import java.util.ArrayList;
import java.util.List;

class Biblioteca {
    private String nome;
    private List<Livro> livrosDisponiveis;

    public Biblioteca(String nome) {
        this.nome = nome;
        this.livrosDisponiveis = new ArrayList<>();
    }

    public void adicionarLivro(Livro livro) {
        livrosDisponiveis.add(livro);
        System.out.println("Livro adicionado: " + livro.getTitulo());
    }

    public void removerLivro(Livro livro) {
        if (livrosDisponiveis.remove(livro)) {
            System.out.println("Livro removido: " + livro.getTitulo());
        } else {
            System.out.println("O livro não está disponível na biblioteca.");
        }
    }

    public void exibirLivrosDisponiveis() {
        if (livrosDisponiveis.isEmpty()) {
            System.out.println("Não há livros disponíveis na biblioteca.");
        } else {
            System.out.println("Livros disponíveis na biblioteca " + nome + ":");
            for (Livro livro : livrosDisponiveis) {
                livro.exibirInformacoes();
            }
        }
    }

    public void emprestarLivro(Livro livro, Usuario usuario) {
        if (livrosDisponiveis.contains(livro)) {
            livrosDisponiveis.remove(livro);
            usuario.emprestarLivro(livro);
        } else {
            System.out.println("O livro " + livro.getTitulo() + " não está disponível para empréstimo.");
        }
    }

    public void devolverLivro(Livro livro, Usuario usuario) {
        usuario.devolverLivro(livro);
        adicionarLivro(livro);
    }
}


