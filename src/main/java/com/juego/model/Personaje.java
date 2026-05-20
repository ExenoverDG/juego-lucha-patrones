package com.juego.model;

public interface Personaje {

    void atacar(Personaje oponente);

    void recibirDano(int dano);

    boolean estaVivo();

    String getNombre();

    int getPuntosDeVida();
}