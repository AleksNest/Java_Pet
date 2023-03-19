package Models;

import Service.Counter;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

public class Nursery {


    private final Counter idCounter;
    private static List<Animal> animals;
    private static List<Animal> database;

    public Nursery(Counter counter) throws FileNotFoundException {

        this.idCounter = counter;
        animals = new ArrayList<>();
    }


    public List<Animal> getAnimals() {
        return animals;
    }

    public Counter getIdCounter() {
        return idCounter;
    }


    public void addNewAnimal(Animal animal) {
        animal.setId(idCounter.add());
        animals.add(animal);
    }


    public static int searchPositionAnimalToAnimalList(int id) {
        int count = 0;
        for (Animal animal : animals) {
            if (id == animal.getId()) {
                return count;
            }
            count++;
        }
        return -1;
    }

    public int getSizeOfAnimalList() {
        return animals.size();
    }
}