package com.company;


import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import org.json.JSONArray;
import org.json.JSONException;


public class JsonUtiles {
    public static void grabar(JSONArray array) {
        try {
            FileWriter file = new FileWriter("Empresa.json");
            file.write(array.toString());
            file.flush();
            file.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void leer()
    {
        try
        {
            String contenido = new String(Files.readAllBytes(Paths.get("Empresa.json")));
            JSONArray array = new JSONArray(contenido);
            System.out.println(array.toString());
        }
        catch (IOException e)
        {
            e.printStackTrace();
        } catch (JSONException e) {
            e.printStackTrace();
        }

    }
}