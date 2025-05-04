package exercicio1oo.testes;

import exercicio1oo.classes.ContaBancaria;

public class TesteContaBancaria {

    public static void main(String[] args) {

        ContaBancaria conta = new ContaBancaria();
        conta.numeroConta = "00123456";
        conta.titular = "Paulo Silveira";
        conta.saldo = 2500.89;

        System.out.println("Número da Conta: " + conta.numeroConta);
        System.out.println("Titular: " + conta.titular);
        System.out.println("Saldo: " + conta.saldo);
    }
}
