package org.example;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import org.example.models.Pelicula;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class archivoJson {
    public void guardarPeliculaEnJson(Pelicula pelicula) throws IOException {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();

        FileWriter archivo = new FileWriter(pelicula.title() + ".json");
        archivo.write(gson.toJson(pelicula));
        archivo.close();
        
    }
}
