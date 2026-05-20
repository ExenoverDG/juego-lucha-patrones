package com.juego.patrones.strategy;

import java.util.Random;

public class AtaqueFuerte
        implements EstrategiaAtaque {

    @Override
    public int atacar() {

        Random rand = new Random();

        return rand.nextInt(21) + 20;
    }
}