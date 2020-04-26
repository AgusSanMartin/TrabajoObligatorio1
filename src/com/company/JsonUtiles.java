package com.company;


import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.nio.file.Paths;
import java.util.ArrayList;

import com.google.gson.Gson;
import org.json.JSONArray;


public class JsonUtiles {
    public static void grabar(JSONArray array) {
        try {
            FileWriter file = new FileWriter("Empresa.json");
            file.write(String.valueOf(array));
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
            Gson gson = new Gson();
            Reader reader = new FileReader(String.valueOf(Paths.get("Empresa.json")));

            ArrayList list = gson.fromJson(reader, ArrayList.class);
            System.out.println(list);


        }
        catch (IOException e)
        {
            e.printStackTrace();
        }/* catch (JSONException e) {
            e.printStackTrace();
        }*/

    }
}
