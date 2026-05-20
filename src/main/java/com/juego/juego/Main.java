package com.juego.juego;

import java.util.Scanner;

import com.juego.model.Personaje;
import com.juego.model.PersonajeBase;

import com.juego.patrones.decorator.EscudoDecorador;
import com.juego.patrones.decorator.VenenoDecorador;

import com.juego.patrones.strategy.AtaqueFuerte;
import com.juego.patrones.strategy.AtaqueNormal;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Nombre jugador 1: ");

        String n1 = sc.nextLine();

        System.out.print("Nombre jugador 2: ");

        String n2 = sc.nextLine();

        Personaje jugador1 =

                new VenenoDecorador(

                        new EscudoDecorador(

                                new PersonajeBase(
                                        n1,
                                        new AtaqueFuerte()
                                )
                        )
                );

        Personaje jugador2 =

                new PersonajeBase(
                        n2,
                        new AtaqueNormal()
                );

        JuegoLucha juego =
                new JuegoLucha(
                        jugador1,
                        jugador2
                );

        juego.iniciarPelea();

        sc.close();
    }
}