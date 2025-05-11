package exercicio2oo.testes;

import exercicio2oo.classes.Livro;

public class TestaLivro {
        public static void main(String[] args) {
            Livro livro = new Livro();
            livro.titulo = "Harry Potter";
            livro.autor = "JK Rowling";
            livro.genero = "Fantasia";
            livro.emprestado = true;

            System.out.println("O livro " + livro.titulo + " " + "Está emprestado? " + " " + livro.emprestado);
        }
}
