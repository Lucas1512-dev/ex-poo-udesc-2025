package exercicio2oo.testes;

import exercicio1oo.classes.Retangulo;

public class TesteRetangulo {

    public static void main(String[] args) {
        Retangulo retangulo = new Retangulo();
        retangulo.largura = 8;
        retangulo.altura = 15;

        System.out.println("Largura: " + retangulo.largura);
        System.out.println("Altura: " + retangulo.altura);
    }
}
