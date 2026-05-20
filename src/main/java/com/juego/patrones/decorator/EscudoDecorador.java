package com.juego.patrones.decorator;

import com.juego.model.Personaje;

public class EscudoDecorador
        extends PersonajeDecorador {

    private int escudo = 20;

    public EscudoDecorador(Personaje componente) {

        super(componente);
    }

    @Override
    public void recibirDano(int dano) {

        if (escudo > 0) {

            int absorbido =
                    Math.min(escudo, dano);

            escudo -= absorbido;

            dano -= absorbido;

            System.out.println(
                    "[Escudo absorbe "
                    + absorbido
                    + " pts. Escudo restante: "
                    + escudo
                    + "]"
            );
        }

        if (dano > 0) {

            componente.recibirDano(dano);
        }
    }

    @Override
    public String getNombre() {

        return componente.getNombre()
                + " [Escudo]";
    }
}