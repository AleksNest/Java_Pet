package Repository;

import Models.Animal;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import static java.io.File.separator;


public class WriteToFile {

    String path = "src" + separator + "main" + separator + "java" + separator + "Nursery.txt";
    public File file ;

    public WriteToFile() {
         this.file = new File(path);

    }

    public void writeToFile (List<Animal> animals) throws IOException {
        PrintWriter pw = new PrintWriter((new FileWriter(path, true)));

        for (Animal pet:animals) {
            pw.println(animals);
        }

        pw.close();
    }



}

