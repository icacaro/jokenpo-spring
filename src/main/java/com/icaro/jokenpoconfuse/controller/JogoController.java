package com.icaro.jokenpoconfuse.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.icaro.jokenpoconfuse.dto.JogadaRequest;
import com.icaro.jokenpoconfuse.dto.ResultadoResponse;
import com.icaro.jokenpoconfuse.model.Jogo;

@RestController
@RequestMapping("/api/jokenpo")
public class JogoController {

    private final Jogo jogo = new Jogo();

    @PostMapping("/jogar")
    public ResultadoResponse jogar(@RequestBody JogadaRequest request) {
        if (jogo.isFinalizado()) {
            return new ResultadoResponse(
                "O jogo ja terminou!",
                null,
                jogo.getVitoriasJogador(),
                jogo.getVitoriasComputador(),
                true,
                jogo.resultado()
            );
        }

        jogo.setJogadaJogador(request.getJogada());
        jogo.jogadaComputador();
        String resultadoRodada = jogo.resultado();

        return new ResultadoResponse(
            resultadoRodada,
            jogo.getJogadaComputador(),
            jogo.getVitoriasJogador(),
            jogo.getVitoriasComputador(),
            jogo.isFinalizado(),
            jogo.isFinalizado() ? resultadoRodada : null 
        );
    }
    
}
