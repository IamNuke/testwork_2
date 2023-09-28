package Core.Models;

import java.util.Date;

public class Cat extends Pet{
    public Cat(Integer id,  String dateOfBirth, String name) {
        super(id, 2, dateOfBirth, name);
    }
}
