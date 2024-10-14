package org.example;

import java.util.ArrayList;
import java.util.List;

class Usuario {
    private String nome;
    private List<Livro> livrosEmprestados;

    public Usuario(String nome) {
        this.nome = nome;
        this.livrosEmprestados = new ArrayList<>();
    }

    public void emprestarLivro(Livro livro) {
        livrosEmprestados.add(livro);
        System.out.println(nome + " emprestou o livro: " + livro.getTitulo());
    }

    public void devolverLivro(Livro livro) {
        if (livrosEmprestados.remove(livro)) {
            System.out.println(nome + " devolveu o livro: " + livro.getTitulo());
        } else {
            System.out.println(nome + " não tem este livro emprestado.");
        }
    }

    public void exibirLivrosEmprestados() {
        if (livrosEmprestados.isEmpty()) {
            System.out.println(nome + " não tem livros emprestados.");
        } else {
            System.out.println("Livros emprestados por " + nome + ":");
            for (Livro livro : livrosEmprestados) {
                livro.exibirInformacoes();
            }
        }
    }
}
