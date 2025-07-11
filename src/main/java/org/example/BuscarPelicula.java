package org.example;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;

import org.example.models.Pelicula;

import com.google.gson.Gson;

public class BuscarPelicula{

    public Pelicula pelicula(int numeroPelicula){

        String direccion = "https://swapi.py4e.com/api/films/" + numeroPelicula + "/";
 
        HttpClient client = HttpClient.newHttpClient();

        HttpRequest request = HttpRequest.newBuilder()
            .uri(URI.create(direccion)) 
            .build();

        HttpResponse<String> response = null;

        try {
            response = client
                .send(request, BodyHandlers.ofString());

            return new Gson().fromJson(response.body(), Pelicula.class);

        } catch (IOException | InterruptedException e) {

            throw new RuntimeException("No se pudo obtener la película");
        }

        

    }
}