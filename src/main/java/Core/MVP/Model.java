package Core.MVP;

import Core.Models.Animal;
import Core.Stucture.Pets;

import java.io.*;

public class Model {
    Pets currentPets;
    private int currentId;
    private String path;

    public Model(String path) {
        currentPets = new Pets();
        currentId = 0;
        this.path = path;
    }

    public void load() {
        try {
            File file = new File(path);
            FileReader fr = new FileReader(file);
            BufferedReader reader = new BufferedReader(fr);
            String fname = reader.readLine();
            while (fname != null) {
                String lname = reader.readLine();
                //this.currentPets.addNewPet(new Animal());
                fname = reader.readLine();
            }
            reader.close();
            fr.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void save() {

        try (FileWriter writer = new FileWriter(path, false)) {
            for (int i = 0; i < currentPets.count(); i++) {
                Animal contact = currentPets.getPetById(i);
                //writer.append(String.format("%s\n", contact.getName()));
            }
            writer.flush();
            writer.close();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
    public Pets currentPets() {
        return this.currentPets;
    }

    public int getCurrentId() {
        return this.currentId;
    }

    public void setCurrentIndex(int value) {
        this.currentId = value;
    }

    public Animal getByName(String name){
        return this.currentPets.getPetByName(name);
    }
}
