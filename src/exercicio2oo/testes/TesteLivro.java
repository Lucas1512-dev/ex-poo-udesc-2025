package exercicio2oo.testes;

import exercicio1oo.classes.Livro;

public class TesteLivro {

    public static void main(String[] args) {

        Livro livro = new Livro();
        livro.titulo = "Harry Potter";
        livro.autor = "J.K. Rowling";
        livro.genero = "Fantasia";
        livro.emprestado = true;

        System.out.println("Título: " + livro.titulo);
        System.out.println("Autor: " + livro.autor);
        System.out.println("Gênero: " + livro.genero);
        System.out.println("Emprestado: " + livro.emprestado);

    }
}
