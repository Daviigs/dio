package com.davi.dev.iphone;

public class Main {
    public static void main(String[] args) {
        // Criando a instância do objeto Iphone
        Iphone iphone = new Iphone();

        // Chamando os métodos do objeto iphone
        iphone.selecionarMusica("Imagine - John Lennon");
        iphone.tocar();
        iphone.pausar();

        iphone.ligar("(11) 98765-4321");
        iphone.atender();
        iphone.iniciarCorreioVoz();

        iphone.exibirPagina("https://www.apple.com");
        iphone.adicionarNovaAba();
        iphone.atualizarPagina();
    }
}