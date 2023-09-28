package Core.Models;

import java.util.Date;

public class Horse extends PackAnimal{
    public Horse(Integer id, String dateOfBirth, String name) {
        super(id, 4, dateOfBirth, name);
    }
}
