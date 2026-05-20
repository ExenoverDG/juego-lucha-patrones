package com.juego.patrones.strategy;

import java.util.Random;

public class AtaqueNormal
        implements EstrategiaAtaque {

    @Override
    public int atacar() {

        Random rand = new Random();

        return rand.nextInt(21) + 10;
    }
}