package Core.Stucture;

import Core.Models.Animal;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Pets {

    private final List<Animal> pets;
    public Pets()
    {
        pets = new ArrayList<Animal>();
    }

    private boolean contains(int index) {
        return pets != null
                && pets.size() > index;
    }
    public List<Animal> getPets() {
        return pets;
    }
    public Animal getPetById(Integer id){
        return contains(id) ? pets.get(id) : null;
    }

    public Animal getPetByName(String name){
        for (Animal num : pets) {
           if (num.getName().equals(name)){
               return  num;
           };
        };
        return null;
    }
    public void addNewPet(Animal newPet){
        if (!pets.contains(newPet)) {
            pets.add(newPet);
        }
    }
    public int count() {
        return pets.size();
    }
    public void showPets() {
        System.out.println(pets);
    }
}
