/* 
 * Copyright 2019 Oscar G.4 - oscargimenez4@gmail.com.
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

/**
 *
 * @author Oscar G.4 - oscargimenez4@gmail.com
 */
public class Main {

    public static void main(String[] args) {
        //Constantes
        final String VACA = "Vaca";
        final String OVEJA = "Ovejas";
        final String BURRO = "Burros";
        final String GALLINA = "Gallinas";
        final int CANTIDAD_VACAS = 3;
        final int CANTIDAD_OVEJAS = 14;
        final int CANTIDAD_BURROS = 2;
        final int CANTIDAD_GALLINAS = 18;
        final int PATAS_CUADRUPEDOS = 4;
        final int PATAS_BIPEDOS = 2;
        //Variables
        int cantPatasVaca = CANTIDAD_VACAS * PATAS_CUADRUPEDOS;
        int cantPatasBurro = CANTIDAD_BURROS * PATAS_CUADRUPEDOS;
        int cantPatasOveja = CANTIDAD_OVEJAS * PATAS_CUADRUPEDOS;
        int cantPatasGallina = CANTIDAD_GALLINAS * PATAS_BIPEDOS;
        int totalPatas;
        //Mensajes
        System.out.println("Secuencia de Patas");
        System.out.println("==================");
        System.out.printf("Animal .........: %s%n", VACA);
        System.out.printf("Cantidad .......: %d%n", CANTIDAD_VACAS);
        System.out.printf("Patas ..........: %d%n", cantPatasVaca);
        System.out.println("---");
        System.out.printf("Animal .........: %s%n", OVEJA);
        System.out.printf("Cantidad .......: %d%n", CANTIDAD_OVEJAS);
        System.out.printf("Patas ..........: %d%n", cantPatasOveja);
        System.out.println("---");
        System.out.printf("Animal .........: %s%n", BURRO);
        System.out.printf("Cantidad .......: %d%n", CANTIDAD_BURROS);
        System.out.printf("Patas ..........: %d%n", cantPatasBurro);
        System.out.println("---");
        System.out.printf("Animal .........: %s%n", GALLINA);
        System.out.printf("Cantidad .......: %d%n", CANTIDAD_GALLINAS);
        System.out.printf("Patas ..........: %d%n", cantPatasGallina);
        System.out.println("---");
        totalPatas = cantPatasVaca + cantPatasBurro + cantPatasOveja + cantPatasGallina;
        System.out.printf("Total de Patas .: %d%n", totalPatas);
        System.out.printf("Total de Pares .: %d%n", totalPatas/2);
    }
}
