package org.example;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;

import com.google.gson.Gson;

public class BuscarPelicula{

    Pelicula pelicula(int numeroPelicula){

        String direccion = "https://swapi.py4e.com/api/films/" + numeroPelicula + "/";
 
        HttpClient client = HttpClient.newHttpClient();

        HttpRequest request = HttpRequest.newBuilder()
            .uri(URI.create(direccion)) 
            .build();

        HttpResponse<String> response = null;

        try {
            response = client
                .send(request, BodyHandlers.ofString());

        } catch (IOException | InterruptedException e) {

            e.printStackTrace();
        }

        return new Gson().fromJson(response.body(), Pelicula.class);

    }
}