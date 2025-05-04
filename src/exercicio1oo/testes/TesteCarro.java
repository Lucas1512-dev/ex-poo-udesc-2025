package exercicio1oo.testes;

import exercicio1oo.classes.Carro;

public class TesteCarro {

    public static void main(String[] args) {

        Carro carro = new Carro();
        carro.modelo = "Gol";
        carro.marca = "Volkswagen";
        carro.ano = 1995;
        carro.velocidade = 160;

        System.out.println("Modelo: " + carro.modelo);
        System.out.println("Marca: " + carro.marca);
        System.out.println("Ano: " + carro.ano);
        System.out.println("Velocidade: " + carro.velocidade);

    }
}
