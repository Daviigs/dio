package org.example;

public class Main {

    public static void main(String[] args) {
        Cliente Davi = new Cliente();
        Davi.setNome("Davi");

        Conta cc = new ContaCorrente(Davi);
        Conta poupanca = new ContaPoupanca(Davi);

        cc.depositar(100);
        cc.transferir(100, poupanca);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
    }

}