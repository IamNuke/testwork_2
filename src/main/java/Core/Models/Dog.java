package Core.Models;

import java.util.Date;

public class Dog extends Pet{
    public Dog(Integer id, String dateOfBirth, String name) {
        super(id, 3, dateOfBirth, name);
    }
}
