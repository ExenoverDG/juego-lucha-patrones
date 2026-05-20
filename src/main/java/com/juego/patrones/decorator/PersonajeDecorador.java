package com.juego.patrones.decorator;

import com.juego.model.Personaje;

public abstract class PersonajeDecorador
        implements Personaje {

    protected Personaje componente;

    public PersonajeDecorador(Personaje componente) {

        this.componente = componente;
    }

    @Override
    public void atacar(Personaje op) {

        componente.atacar(op);
    }

    @Override
    public void recibirDano(int d) {

        componente.recibirDano(d);
    }

    @Override
    public boolean estaVivo() {

        return componente.estaVivo();
    }

    @Override
    public String getNombre() {

        return componente.getNombre();
    }

    @Override
    public int getPuntosDeVida() {

        return componente.getPuntosDeVida();
    }
}