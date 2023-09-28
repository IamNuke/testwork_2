package Core.Models;

import java.util.Date;

public abstract class Animal {
    protected Integer id;
    protected Integer number;
    protected String dateOfBirth;
    protected String Name;
    protected PetCommands commands;

    public Animal(Integer id, Integer number, String dateOfBirth, String name) {
        this.id = id;
        this.number = number;
        this.dateOfBirth = dateOfBirth;
        Name = name;

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }
    public void addCommand(Command newCommand){
        commands.addCommand(newCommand);
    }
}
