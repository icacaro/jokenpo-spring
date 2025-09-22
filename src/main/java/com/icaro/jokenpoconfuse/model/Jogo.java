package com.icaro.jokenpoconfuse.model;

import java.util.Random;

public class Jogo {
    private Jogador jogador = new Jogador("Jogador");
    private Jogador computador = new Jogador("Computador");

    private int vitoriasJogador = 0;
    private int vitoriasComputador = 0;

    private boolean isFinalizado = false;

    public void setJogadaJogador(Jogada jogada) { jogador.escolherJogada(jogada);}

    public void jogadaComputador() {
        Jogada[] valores = Jogada.values();
        Jogada jogadaRandom = valores[new Random().nextInt(valores.length)];
        computador.escolherJogada(jogadaRandom);
    }

    public String resultado() {
        Jogada jogadaUsuario = jogador.getJogada();
        Jogada jogadaPC = computador.getJogada();

        if (jogadaUsuario == jogadaPC) {
            return "Empate!";
        } else if (jogadaUsuario.venceDe(jogadaPC)) {
            isFinalizado = true;
            vitoriasJogador++;
            return jogador.getNome() + "venceu!!";
        } else {
            isFinalizado = true;
            vitoriasComputador++;
            return computador.getNome() + "venceu!!";
        }
    }

    public int getVitoriasComputador() {
        return vitoriasComputador;
    }

    public int getVitoriasJogador() {
        return vitoriasJogador;
    }

    public boolean isFinalizado() {
        return isFinalizado;
    }
    
    public Jogada getJogadaComputador() { return computador.getJogada(); }

}
