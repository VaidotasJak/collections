package exceptions.example;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Main {
    public static void main(String[] args){

        try {
            doSmoth();
            readFile();
        } catch (FileNotFoundException e) {
            System.out.println("Failas ura nerastas");
        } catch (TautvydasJegaException e){
            System.out.println("TAutvydas nedaro nd.");
        }

    }

    private  static void readFile() throws FileNotFoundException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader("text.txt"));
    }

    private static void doSmoth() throws TautvydasJegaException{
        throw new TautvydasJegaException("Tautvvydas jega, bet nesvisada");
    }
}
