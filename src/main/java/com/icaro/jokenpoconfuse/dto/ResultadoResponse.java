package com.icaro.jokenpoconfuse.dto;

import com.icaro.jokenpoconfuse.model.Jogada;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ResultadoResponse {
    private String resultadoRodada;
    private Jogada jogadaComputador;
    private int vitoriasJogador;
    private int vitoriasComputador;
    private boolean isFinalizado;
    private String resultadoFinal;

    public ResultadoResponse(String resultadoRodada, Jogada jogadaComputador, int vitoriasJogador, int vitoriasComputador, boolean isFinalizado, String resultadoFinal) {
        this.resultadoRodada = resultadoRodada;
        this.jogadaComputador = jogadaComputador;
        this.vitoriasJogador = vitoriasJogador;
        this.vitoriasComputador = vitoriasComputador;
        this.isFinalizado = isFinalizado;
        this.resultadoFinal = resultadoFinal;
    }


}
