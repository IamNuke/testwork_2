package Core.Models;

import java.util.Date;

public abstract class Pet  extends  Animal{

    public Pet(Integer id, Integer number, Date dateOfBirth, String name) {
        super(id, number, dateOfBirth, name);
    }
}
