import Controller.Controller;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Load pet nursery from file? y/n");
        if (scanner.next().equals("y")) {
            new Controller(1);
        } else {
            new Controller(0);
        }
    }
}