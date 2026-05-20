package com.juego.juego;

import com.juego.model.Personaje;

public class JuegoLucha {

    private Personaje jugador1;

    private Personaje jugador2;

    public JuegoLucha(
            Personaje p1,
            Personaje p2) {

        this.jugador1 = p1;

        this.jugador2 = p2;
    }

    public void iniciarPelea() {

        System.out.println(
                "=== PELEA: "
                + jugador1.getNombre()
                + " vs "
                + jugador2.getNombre()
                + " ==="
        );

        while (
                jugador1.estaVivo()
                &&
                jugador2.estaVivo()
        ) {

            turno(jugador1, jugador2);

            if (jugador2.estaVivo()) {

                turno(jugador2, jugador1);
            }
        }

        String ganador =
                jugador1.estaVivo()
                ?
                jugador1.getNombre()
                :
                jugador2.getNombre();

        System.out.println(
                "\n>>> GANADOR: "
                + ganador
                + " <<<"
        );
    }

    private void turno(
            Personaje atac,
            Personaje def) {

        System.out.println(
                "\nTurno de "
                + atac.getNombre()
                + " | HP def: "
                + def.getPuntosDeVida()
        );

        atac.atacar(def);

        System.out.println(
                def.getNombre()
                + ": "
                + def.getPuntosDeVida()
                + " HP"
        );
    }
}