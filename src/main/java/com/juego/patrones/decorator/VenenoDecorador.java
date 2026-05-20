package com.juego.patrones.decorator;

import com.juego.model.Personaje;

public class VenenoDecorador
        extends PersonajeDecorador {

    private static final int DANO_VENENO = 5;

    public VenenoDecorador(Personaje componente) {

        super(componente);
    }

    @Override
    public void atacar(Personaje oponente) {

        componente.atacar(oponente);

        oponente.recibirDano(DANO_VENENO);

        System.out.println(
                "[Veneno inflige "
                + DANO_VENENO
                + " pts extra]"
        );
    }

    @Override
    public String getNombre() {

        return componente.getNombre()
                + " [Veneno]";
    }
}