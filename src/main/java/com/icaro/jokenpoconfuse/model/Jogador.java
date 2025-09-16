package com.icaro.jokenpoconfuse.model;

public class Jogador {
    
    private String nome;
    private Jogada jogada;

    public Jogador(final String nome) { this.nome = nome; }

    public void escolherJogada(final Jogada jogada) { this.jogada = jogada; }

    public Jogada getJogada() { return jogada; }

    public String getNome() { return nome; }

}
