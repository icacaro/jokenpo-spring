package com.icaro.jokenpoconfuse.model;

public class Jogo {
    private Jogador jogador;
    private Jogador computador;

    private boolean isFinalizado = false;
    public void setJogadaJogador(Jogada jogada) { jogador.escolherJogada(jogada);}


}
