package org.example.main;

import java.util.Scanner;

import org.example.BuscarPelicula;
import org.example.Pelicula;


public class Main {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese el número de la película (1-7): ");
        BuscarPelicula buscarPelicula = new BuscarPelicula();
        Pelicula pelicula = buscarPelicula.numeroPelicula(1);
    }
}