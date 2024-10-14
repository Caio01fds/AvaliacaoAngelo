package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class App {
    public static void main(String[] args) {
        // Criando alguns livros
        Livro livro1 = new Livro("O Senhor dos Anéis", "J.R.R. Tolkien", 1954);

        Biblioteca biblioteca = new Biblioteca("Biblioteca Central");

        biblioteca.adicionarLivro(livro1);


        biblioteca.exibirLivrosDisponiveis();

        Usuario usuario1 = new Usuario("Alice");

        biblioteca.emprestarLivro(livro1, usuario1);

        usuario1.exibirLivrosEmprestados();

        biblioteca.emprestarLivro(livro1, usuario1);

        biblioteca.devolverLivro(livro1, usuario1);

        biblioteca.exibirLivrosDisponiveis();

        usuario1.exibirLivrosEmprestados();
    }

}