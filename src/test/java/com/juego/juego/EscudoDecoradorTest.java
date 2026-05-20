package com.juego.juego;

import com.juego.model.Personaje;
import com.juego.model.PersonajeBase;
import com.juego.patrones.decorator.EscudoDecorador;
import com.juego.patrones.strategy.AtaqueNormal;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class EscudoDecoradorTest {

    @Test
    void escudoDebeAbsorberDano() {

        Personaje personaje =
                new EscudoDecorador(
                        new PersonajeBase(
                                "Liu Kang",
                                new AtaqueNormal()
                        )
                );

        personaje.recibirDano(10);

        assertEquals(
                100,
                personaje.getPuntosDeVida()
        );
    }
}