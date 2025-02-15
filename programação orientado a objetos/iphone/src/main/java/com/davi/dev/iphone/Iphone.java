package com.davi.dev.iphone;

public class Iphone {

    // Métodos de Música
    public void tocar() {
        System.out.println("Reproduzindo música...");
    }

    public void pausar() {
        System.out.println("Música pausada.");
    }

    public void selecionarMusica(String musica) {
        System.out.println("Selecionando: " + musica);
    }

    // Aparelho Telefônico
    public void ligar(String numero) {
        System.out.println("Ligando para " + numero);
    }

    public void atender() {
        System.out.println("Atendendo chamada...");
    }

    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz...");
    }

    // Navegador na Internet
    public void exibirPagina(String url) {
        System.out.println("Exibindo: " + url);
    }

    public void adicionarNovaAba() {
        System.out.println("Nova aba aberta.");
    }

    public void atualizarPagina() {
        System.out.println("Atualizando página...");
    }

    // Construtor (se necessário, para inicializar com atributos)
    public Iphone() {
        // Aqui você pode inicializar o iPhone com atributos específicos, se desejar.
    }
}

