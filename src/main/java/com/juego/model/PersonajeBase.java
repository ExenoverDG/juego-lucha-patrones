package com.juego.model;

import com.juego.patrones.strategy.EstrategiaAtaque;

public class PersonajeBase implements Personaje {

    private String nombre;

    private int puntosDeVida;

    private EstrategiaAtaque estrategia;

    public PersonajeBase(
            String nombre,
            EstrategiaAtaque estrategia) {

        this.nombre = nombre;

        this.puntosDeVida = 100;

        this.estrategia = estrategia;
    }

    @Override
    public void atacar(Personaje oponente) {

        int dano = estrategia.atacar();

        oponente.recibirDano(dano);

        System.out.println(
                nombre +
                " ataca causando " +
                dano +
                " pts.");
    }

    @Override
    public void recibirDano(int dano) {

        puntosDeVida -= dano;

        if (puntosDeVida < 0) {

            puntosDeVida = 0;
        }
    }

    @Override
    public boolean estaVivo() {

        return puntosDeVida > 0;
    }

    @Override
    public String getNombre() {

        return nombre;
    }

    @Override
    public int getPuntosDeVida() {

        return puntosDeVida;
    }
}