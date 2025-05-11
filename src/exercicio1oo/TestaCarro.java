package exercicio1oo;

    class TestaCarro {
        public static void main(String[] args) {
            Carro carro = new Carro();
            carro.modelo = "Fusca";
            carro.marca = "Volkswagen";
            carro.ano = 1970;
            carro.velocidade = 80;

            System.out.println("O " + carro.modelo + " " + "do fabricante " + " " + carro.marca + " " + "fabricado no ano de " + " " + carro.ano + " " + "pode alcançar a velocidade de " + " " + carro.velocidade + "km/h");
            ;
        }
}
