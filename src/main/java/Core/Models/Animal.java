package Core.Models;

import java.util.Date;

public abstract class Animal {
    protected Integer id;
    protected Integer number;
    protected Date dateOfBirth;
    protected String Name;
    protected PetCommands commands;

    public Animal(Integer id, Integer number, Date dateOfBirth, String name) {
        this.id = id;
        this.number = number;
        this.dateOfBirth = dateOfBirth;
        Name = name;

    }
}
