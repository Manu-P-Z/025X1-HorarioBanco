/* 
 * Copyright 2019 Manu Portolés Zagalá.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.japo.java.main;

import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Manu Portolés Zagalá
 */
public class Main {

    public static final Random RND = new Random();

    /**
     * @param args the command line arguments
     */
    public static final Scanner SCN
            = new Scanner(System.in, "ISO-8859-1")
                    .useLocale(Locale.ENGLISH).useDelimiter("\\s+");

    public static void main(String[] args) {

        //horarioBanco
        final int HORA_MIN = 10;
        final int MIN_MIN = 30;

        final int HORA_MAX = 12;
        final int MIN_MAX = 15;

        //rangoValorRandom
        final int HORA_MIN_RND = 0;
        final int MIN_MIN_RND = 0;

        final int HORA_MAX_RND = 23;
        final int MIN_MAX_RND = 59;

        //datosUsuario
        int horaUsr;
        int minUsr;

        //datosRandom
        int horaRnd;
        int minRnd;

        //abierto/cerrado
        boolean banAbm;
        boolean banAbr;

        //horarioenMinutos
        int mAb;
        int mCr;

        //valoresMinutosRandom/consola
        int mAbr;
        int mAbc;

        mAb = HORA_MIN * 60 + MIN_MIN;
        mCr = HORA_MAX * 60 + MIN_MAX;

        horaRnd = RND.nextInt(HORA_MAX_RND - HORA_MIN_RND + 1) + HORA_MIN_RND;
        minRnd = RND.nextInt(MIN_MAX_RND - MIN_MIN_RND + 1) + MIN_MIN_RND;

        //valorRandomMinutos
        mAbr = horaRnd * 60 + minRnd;

        //comprobacionValoresAleatorios
       // banAbr = mAbr >= mAb && mAbr <= mCr;

        try {

            //introducirValores
            System.out.print("Introduzca hora entrada....: ");

            horaUsr = SCN.nextInt();

            SCN.nextLine();

            System.out.print("Introduzca minuto entrada..: ");

            minUsr = SCN.nextInt();

            SCN.nextLine();

            //valor
            mAbc = horaUsr * 60 + minUsr;

            //comprobaciónValoresConsola
           // banAbm = mAbc >= mAb && mAbc <= mCr;

            //Mensajes
            System.out.printf("%s %02d:%02d%n", "El valor determinado aleatoriamente como hora para entrar al banco es:", horaRnd, minRnd);
            //   System.out.printf("%s %b%n%n", "La hora determinada por el valor aleatorio es válida para entrar al banco ....:", banAbr);
            System.out.printf("Hora Aleatoria .: %s%n", mAbr >= mAb && mAbr <= mCr ? "Valor aleatorio correcto" : "Valor aleatorio incorrecto");
            
            
            System.out.printf("%s %02d:%02d%n", "El valor determinado por el usuario como hora para entrar al banco es:", horaUsr, minUsr);
            System.out.printf("Hora Manual ....: %s%n", mAbc >= mAb && mAbc <= mCr ? "Valor introducido Correcto" : "Valor introducido incorrecto");
            //   System.out.printf("%s %b%n%n", "La hora determinada por el usuario es válida para entrar al banco ............:", banAbm);

        } catch (Exception e) {
            System.out.println("Error, parámetro introducido erróneo");
        } finally {
            
        }
    }

}
//  MensajesExplicativos
//  System.out.printf(mAbr >= mAb && mAbr <= mCr ? "Valor aleatorio correcto" : "Valor aleatorio incorrecto");
//  System.out.printf(mAbc >= mAb && mAbc <= mCr ? "Valor introducido Correcto" : "Valor introducido incorrecto");
//comentando líneas 83 y 99
