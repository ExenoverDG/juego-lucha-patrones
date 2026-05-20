package com.juego.juego;

import com.juego.model.PersonajeBase;
import com.juego.patrones.strategy.AtaqueNormal;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PersonajeBaseTest {

    @Test
    void personajeDebeIniciarCon100HP() {

        PersonajeBase personaje =
                new PersonajeBase(
                        "Scorpion",
                        new AtaqueNormal()
                );

        assertEquals(
                100,
                personaje.getPuntosDeVida()
        );
    }

    @Test
    void personajeDebeRecibirDano() {

        PersonajeBase personaje =
                new PersonajeBase(
                        "SubZero",
                        new AtaqueNormal()
                );

        personaje.recibirDano(30);

        assertEquals(
                70,
                personaje.getPuntosDeVida()
        );
    }

    @Test
    void hpNoDebeSerNegativo() {

        PersonajeBase personaje =
                new PersonajeBase(
                        "Raiden",
                        new AtaqueNormal()
                );

        personaje.recibirDano(500);

        assertEquals(
                0,
                personaje.getPuntosDeVida()
        );
    }
}