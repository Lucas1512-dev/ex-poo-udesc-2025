package exercicio1oo;

    class TesteContaBancaria {
        public static void main(String[] args) {
            ContaBancaria conta = new ContaBancaria();
            conta.numeroConta = "2345";
            conta.titular = "José da Silva";
            conta.saldo = 50.00;

            System.out.println("O Sr. " + conta.titular + " " + "Titular da conta: " + conta.numeroConta + " " + "possui saldo de: " + conta.saldo);
        }

}
