package homework.service;

import JSON.example.model.Person;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import homework.Product;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.*;
import java.lang.reflect.Type;
import java.util.List;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class JsonReadingService {
    private String filePath;
    public List<Product> getDataFromFile(){
        Gson gson = new Gson();
        Type productListType = new TypeToken<List<Product>>(){}.getType();
        List<Product> productFromFile;
        try {
            Reader reader = new FileReader(filePath);
            productFromFile = gson.fromJson(reader, productListType);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        return productFromFile;
    }

    public void writeDataToFile(String filepath, List<Person> people){
        try(Writer writer = new FileWriter(filepath)){
            new Gson().toJson(people, writer);
        }catch(IOException ex){
            throw new RuntimeException(ex);
        }
    }
}
