package JSON.example.service;

import JSON.example.model.Person;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.*;
import java.lang.reflect.Type;
import java.util.List;

public class JsonReadingService {
    public List<Person> getDataFromFile(String filePath){
        Gson gson = new Gson();
        Type personListType = new TypeToken<List<Person>>(){}.getType();
        List<Person> peropleFromFile;
        try {
            Reader reader = new FileReader(filePath);
            peropleFromFile = gson.fromJson(reader, personListType);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        return peropleFromFile;
    }

    public void writeDataToFile(String filepath, List<Person> people){
        try(Writer writer = new FileWriter(filepath)){
            new Gson().toJson(people, writer);
        }catch(IOException ex){
            throw new RuntimeException(ex);
        }
    }
}
