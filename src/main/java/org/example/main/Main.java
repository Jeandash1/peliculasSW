package org.example.main;

import java.io.FileWriter;
import java.util.Scanner;
import org.example.BuscarPelicula;
import org.example.models.Pelicula;


public class Main {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese el número de la película (1-7): ");
        BuscarPelicula buscar = new BuscarPelicula();
        Pelicula pelicula = buscar.pelicula(leer.nextInt());
        
        System.out.println(pelicula);

        /*FileWriter fileWriter = new FileWriter("pelicula.json");
        fileWriter.write(gson.toJson(pelicula));
        fileWriter.close();*/

    }
}