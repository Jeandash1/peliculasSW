package org.example.main;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import org.example.BuscarPelicula;
import org.example.archivoJson;
import org.example.models.Pelicula;


public class Main {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        BuscarPelicula buscar = new BuscarPelicula();
        System.out.println("Ingrese el número de la película (1-7): ");

        try {
            var numeroPelicula = Integer.valueOf(leer.nextInt());

            Pelicula pelicula = buscar.pelicula(numeroPelicula);
            System.out.println(pelicula);

            archivoJson archivo = new archivoJson();
            archivo.guardarPeliculaEnJson(pelicula);

        }catch(NumberFormatException e) {
            System.out.println("Numero no encontrado " + e.getMessage());
            System.out.println("Finalzando el programa.");

        }catch ( RuntimeException | IOException e) {
            System.out.println(e.getMessage());
            System.out.println("Finalzando el programa.");
        }

        /*FileWriter fileWriter = new FileWriter("pelicula.json");
        fileWriter.write(gson.toJson(pelicula));
        fileWriter.close();*/

    }
}