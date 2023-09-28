package Core.MVP;
import Core.Models.Animal;
import Core.Models.Hamster;
import Core.Models.*;

public class Presenter {
    private Model model;
    private View view;

    public Presenter(View view, String pathDb) {
        this.view = view;
        model = new Model(pathDb);
    }

    public void LoadFromFile() {
        model.load();
    }

    public void add() {
        int animalType = view.getType();
        Animal newPet;

        if (animalType == 1) {
            newPet = new Hamster(
                    model.getCurrentId(),
                    view.getDateOfBirthday(),
                    view.getName()
                    );
        } else if (animalType == 2) {
            newPet = new Cat(
                    model.getCurrentId(),
                    view.getDateOfBirthday(),
                    view.getName()
            );
        }else if (animalType == 3) {
            newPet = new Dog(
                    model.getCurrentId(),
                    view.getDateOfBirthday(),
                    view.getName()
            );
        }else if (animalType == 4) {
            newPet = new Horse(
                    model.getCurrentId(),
                    view.getDateOfBirthday(),
                    view.getName()
            );
        }else if (animalType == 5) {
            newPet = new Camel(
                    model.getCurrentId(),
                    view.getDateOfBirthday(),
                    view.getName()
            );
        }else {
            newPet = new Donkey(
                    model.getCurrentId(),
                    view.getDateOfBirthday(),
                    view.getName()
            );
        }
        model.currentPets().addNewPet(newPet);
    }

    public void showListOfPets(){
        model.currentPets.showPets();
    }

    public void addNewCommand(){
        Animal pet = model.currentPets.getPetByName(view.getName());
       if( pet != null){
           pet.addCommand(view.getCommand());
       }
    }
}
