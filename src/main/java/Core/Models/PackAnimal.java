package Core.Models;

import java.util.Date;

public abstract class PackAnimal extends Animal{
    public PackAnimal(Integer id, Integer number, Date dateOfBirth, String name) {
        super(id, number, dateOfBirth, name);
    }
}
