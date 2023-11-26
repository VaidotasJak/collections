package JSON.example.service;

import JSON.example.model.Car;
import JSON.example.model.Person;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.*;
import java.lang.reflect.Array;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class JsonReader {
    public static void main(String[] args) throws IOException {
        JsonReadingService jsonReadingService = new JsonReadingService();
        String filepath = "src/main/resources/obj.json";
        List<Person> dataFromFile = jsonReadingService.getDataFromFile(filepath);
        System.out.println(dataFromFile);

        Person roman = new Person();
        roman.setName("Roman");
        roman.setFavoriteWords(Arrays.asList("Labas", "Aciu", "Prasau"));
        roman.setCars(Arrays.asList(new Car("Bmw", 100), new Car("Volvo", 150),
                new Car("Mersedes", 200)));
        List<Person> otherPeople = new ArrayList<>();
        otherPeople.add(roman);

        jsonReadingService.writeDataToFile("src/main/resources/obj3.json", otherPeople);


    }
}
